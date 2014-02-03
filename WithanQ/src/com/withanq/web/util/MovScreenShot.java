/*******************************************************************************
 * Copyright (c) 2008, 2010 Xuggle Inc.  All rights reserved.
 *  
 * This file is part of Xuggle-Xuggler-Main.
 *
 * Xuggle-Xuggler-Main is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Xuggle-Xuggler-Main is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Xuggle-Xuggler-Main.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

package com.withanq.web.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.withanq.web.conf.Conf;
import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.MediaListenerAdapter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.mediatool.event.IVideoPictureEvent;
import com.xuggle.xuggler.IContainer;

/**
 * http://www.xuggle.com/xuggler/licensing
 * @author aclarke
 * @author trebor
 */

public class MovScreenShot extends MediaListenerAdapter{
	private static String userDir = System.getProperty("user.dir");
	private boolean isCaptured = false;
	private String fileName;
	public MovScreenShot(String filePath){
		System.out.println("MovScreenShot start " + isCaptured);
		IMediaReader reader = ToolFactory.makeReader(filePath);
		reader.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		reader.addListener(this);
		while (reader.readPacket() == null && !isCaptured);
		reader.close();
		IContainer container = reader.getContainer();
		container.close();
		System.out.println("MovScreenShot end" + isCaptured);
	}
  
  
	@Override
	public void onVideoPicture(IVideoPictureEvent event) {
		System.out.println("onVideoPicture");
		File file = null;
		try {
			this.fileName = Conf.Path.MOV_ROOT + System.currentTimeMillis() + ".jpg";
			file = new File(this.fileName);
			ImageIO.write(event.getImage(), "jpg", file);
		} catch (IOException e) {
			e.printStackTrace();
		}

        System.out.printf("created file: %s\n", file);
		isCaptured = true;
		super.onVideoPicture(event);
	}
  
	public String getFileName() {
		return fileName;
	}


	public static void main(String[] args){
		MovScreenShot movScreenShot = new MovScreenShot(Conf.Path.MOV_ROOT+"test1.mov");
		System.out.println(movScreenShot.getFileName());
	}
}

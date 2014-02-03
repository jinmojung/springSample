package com.withanq.cont.type;

public class Image implements Data{

	@Override
	public ContType getContType() {
		return ContType.IMAGE;
	}
	private final String url ;
	public Image(String url) {
		super();
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
}

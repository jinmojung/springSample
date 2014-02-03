package kr.co.mnbiz.api.message;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import kr.co.mnbiz.util.Strings;

public class KrMessageManager extends MessageManager {


	public KrMessageManager(Map<String, String> datum) {
		super(datum);
	}
	
	
	public static void main(String[] args) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("1", "나[는/은] 너[를/을] 지갑[와/과] 학생[로/으로]부터");
		
		KrMessageManager k = new KrMessageManager(data);
		System.out.println(k.format("1","응"));
		
	}
	
	@Override
	public String format(String id, Object... datum) {
		String st =  MessageFormat.format(get(id), datum);
		return Strings.processJosa(st);
	}
}

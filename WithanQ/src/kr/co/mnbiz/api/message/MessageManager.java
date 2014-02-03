package kr.co.mnbiz.api.message;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class MessageManager {

	private final Map<String, String>	datum;

	public String get(String id) {
		String ret = datum.get(id);
		if (ret == null) {
			return id;
		}
		return ret;
	}

	public MessageManager(Map<String, String> datum) {
		this.datum = new HashMap<String, String>(datum);
	}

	public String format(String id, Object... datum) {
		return MessageFormat.format(get(id), datum);
	}
}

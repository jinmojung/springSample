package com.withanq.cont.type;

public class Text implements Data{

	@Override
	public ContType getContType() {
		return ContType.TEXT;
	}

	private final String data;

	public Text(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

}

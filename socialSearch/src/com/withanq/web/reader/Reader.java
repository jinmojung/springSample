package com.withanq.web.reader;



abstract class Reader {
	protected Reader successor;
	public void setSuccessor(Reader successor) {
		this.successor = successor;
	}
	 
	abstract public void findReader(String url) throws Exception;
	
	abstract public void readData(String url) throws Exception;
    
}

package com.prototype.five;

public class Netwokconnection implements Cloneable {
	
	private String ip;
	private String importantdata;
	
	
	public String getImportantdata() {
		return importantdata;
	}
	public void setImportantdata(String importantdata) {
		this.importantdata = importantdata;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public void loadveryimportantdata() {
		this.importantdata="this is very impotytanat data";
		
	}
	@Override
	public String toString() {
		return "Netwokconnection [ip=" + ip + ", importantdata=" + importantdata + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}

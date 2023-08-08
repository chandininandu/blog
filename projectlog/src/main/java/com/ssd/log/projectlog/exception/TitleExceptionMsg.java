package com.ssd.log.projectlog.exception;

public class TitleExceptionMsg extends RuntimeException {
	
	private String title;
	private String expMsg;
	
	
	public TitleExceptionMsg(String title, String expMsg) {
		super();
		this.title = title;
		this.expMsg = expMsg;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExpMsg() {
		return expMsg;
	}
	public void setExpMsg(String expMsg) {
		this.expMsg = expMsg;
	}
	
	
	

}

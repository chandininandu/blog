package com.ssd.blog.exceptions;

import java.util.Date;

public class ExceptionDetails {
	
	private Date timeStamp;
	private String field;
	private String erMsg;
	
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getErMsg() {
		return erMsg;
	}
	public void setErMsg(String erMsg) {
		this.erMsg = erMsg;
	}
	public ExceptionDetails(Date timeStamp, String field, String erMsg) {
		super();
		this.timeStamp = timeStamp;
		this.field = field;
		this.erMsg = erMsg;
	}
	public ExceptionDetails() {
		super();
	}
	
	

}

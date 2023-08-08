package com.ssd.log.projectlog.exception;

import java.util.Date;

public class ExceptionDetails {
	
	private Date timeStamp;
	private String field;
	private String msg;
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ExceptionDetails(Date timeStamp, String field, String msg) {
		super();
		this.timeStamp = timeStamp;
		this.field = field;
		this.msg = msg;
	}
	public ExceptionDetails() {
		super();
	}
	
	
	

}

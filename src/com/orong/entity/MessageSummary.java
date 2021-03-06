package com.orong.entity;

import java.io.Serializable;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.orong.utils.Bean;

/**
 * @Title: Summary.java
 * @Description: 站内信息摘要
 * @author lanhaizhong
 * @date 2013年8月16日 上午11:36:50
 * @version V1.0 Copyright (c) 2013 Company,Inc. All Rights Reserved.
 * 
 */
public class MessageSummary implements Bean, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Message_ID;
	private int Read_Flag; //信息读取状态0未读1已经
	private String Title;
	private Date Send_Date;

	public MessageSummary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageSummary(String message_ID, int read_Flag, String title, Date send_Date) {
		super();
		Message_ID = message_ID;
		Read_Flag = read_Flag;
		Title = title;
		Send_Date = send_Date;
	}

	public String getMessage_ID() {
		return Message_ID;
	}

	public void setMessage_ID(String message_ID) {
		Message_ID = message_ID;
	}

	public int getRead_Flag() {
		return Read_Flag;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Date getSend_Date() {
		return Send_Date;
	}

	public void setSend_Date(Date send_Date) {
		Send_Date = send_Date;
	}

	public void setSend_Date(long dateTime) {
		Send_Date = new Date(dateTime);
	}
	public void setRead_Flag(int read_Flag) {
		Read_Flag = read_Flag;
	}

	public String getFomatDate() {
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return time.format(this.Send_Date);

	}
}

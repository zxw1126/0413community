package com.hithink.community.main.bean;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Outsiders {
	private Integer id;
	private Integer sex;
	private String name;
	private Timestamp inTime;
	private Timestamp outTime;
	private String idCard;
	private Integer pNumber;
	private String addr;
	private String reason;
	
}

package com.hithink.community.main.bean;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Remind {
	private Integer id;
	private String name;
	private Integer pNumber;
	private Timestamp inTime;
	private Timestamp outTime;
	private String addr;
	private Integer sex;
}

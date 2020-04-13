package com.hithink.community.main.bean;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class Medicine {
	private Integer id;
	private String med;
	private Timestamp time;
	private Integer medNumber;
	private String idCard;
	private int medCount;
}

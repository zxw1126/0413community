package com.hithink.community.main.bean;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class Turnover {
	private Integer id;
	private Integer pNumber;
	private String reason;
	private Timestamp inTime;
	private Timestamp outTime;
	private Integer isOut;
}

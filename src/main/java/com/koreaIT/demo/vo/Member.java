package com.koreaIT.demo.vo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private int id;
	private String regDate;
	private String loginId;
	private String updateDate;
	private String loginPw;
	private int authLevel;
	private String name;
	private String nickname;
	private String cellphoneNum;
	private String email;
	private int delStatus;
	private String delDate;
}
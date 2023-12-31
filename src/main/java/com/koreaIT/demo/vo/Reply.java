package com.koreaIT.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reply {
	private int id;
	private String regDate;
	private String updateDate;
	private String relTypeCode;
	private int relId;
	private String body;
	private int memberId;

	private String writerName;

	public String getForPrintBody() {
		return this.body.replaceAll("\n", "<br />");
	}


}
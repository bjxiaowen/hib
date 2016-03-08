package com.hib.pojo;

import java.util.Date;

/**
 * Ñ§Éú
 * @author xiangxiaowen
 *
 */
public class Student {
	
	private String sId;
	
	private String sName;
	
	private String sex;
	
	private Date birtday;

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirtday() {
		return birtday;
	}

	public void setBirtday(Date birtday) {
		this.birtday = birtday;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sex=" + sex + ", birtday=" + birtday + "]";
	}

}

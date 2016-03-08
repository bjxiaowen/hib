package com.hib.pojo;
/**
 * ·ÖÊý
 * @author xiangxiaowen
 *
 */
public class Score {

	private String sId;
	
	private String cId;
	
	private int grade;

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Score [sId=" + sId + ", cId=" + cId + ", grade=" + grade + "]";
	}
	
	
	
}

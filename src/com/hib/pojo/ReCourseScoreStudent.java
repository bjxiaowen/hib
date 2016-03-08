package com.hib.pojo;

public class ReCourseScoreStudent {

	private String sId;

	private String sName;

	private String cId;

	private String cName;
	
	private int grade;

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

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "ReCourseScoreStudent [sId=" + sId + ", sName=" + sName + ", cId=" + cId + ", cName=" + cName
				+ ", grade=" + grade + "]";
	}
	
	
	
}

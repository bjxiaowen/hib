package com.hib.pojo;

/**
 * °à¼¶
 * @author xiangxiaowen
 *
 */
public class Course {

	private String cId;
	
	private String cName;
	
	private int cRedit;

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

	public int getcRedit() {
		return cRedit;
	}

	public void setcRedit(int cRedit) {
		this.cRedit = cRedit;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cRedit=" + cRedit + "]";
	}
}

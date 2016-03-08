package com.hib.pojo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getHibernateSession();
		String hql = "select st.sId,st.sName,co.cId,co.cName,sc.grade from Student  st,Score  sc,Course  co where st.sId=sc.sId and sc.cId=co.cId ";
		Query query = session.createQuery(hql);
		List list = query.list();
		for(int i=0;i<list.size();i++){
			ReCourseScoreStudent re=new ReCourseScoreStudent();
			Object[] object = (Object[])list.get(i);
			re.setsId((String)object[0]);
			re.setsName((String)object[1]);
			re.setcId((String)object[2]);
			re.setcName((String)object[3]);
			re.setGrade(Integer.parseInt(object[4]+""));
			System.out.println(re.toString());
		}
		HibernateSessionFactory.closeHibernateSession();
	}
}

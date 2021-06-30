package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	public static void main(String[] args) {
 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {		
			Student student =  new Student("Deepak","D","deepak@gmail.com");
			session.beginTransaction();
			
			session.save(student);
			
			Student student2=session.get(Student.class,"3");
			System.out.println(student2);
			
			List<Student> students=session.createQuery("from student stud where stud.firstName='Mukesh'").list();
			for(Student s:students) {
				System.out.println(s);
			}
			
			session.delete(student2);
			
			session.getTransaction().commit();
			System.out.println("Saved");
		}
		finally {
			factory.close();
		}
	}

}

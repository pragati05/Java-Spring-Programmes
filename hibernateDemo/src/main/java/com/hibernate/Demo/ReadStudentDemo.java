package com.hibernate.Demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

/**
 * Hello world!
 *
 */
public class ReadStudentDemo {
	public static void main(String[] args) {
		Student student1 = new Student("Prags", "Nai", "p@n.com");

		/* Step 1 : Create SessionFactory */
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		/* Step 2: Create Session */
		Session session = sessionFactory.getCurrentSession();

		/* Step 3: Start Transaction */
		try {
			Transaction transaction = session.beginTransaction();
			System.out.println("student: " + student1);
			session.save(student1);
			
			/*Step 4: Commit the changes*/
			transaction.commit();
			session = sessionFactory.getCurrentSession();
			Transaction transactionRead = session.beginTransaction();
			Student retriveObject = (Student) session.get(Student.class, student1.getId());
			System.out.println("retriveObject: " + retriveObject);
			transactionRead.commit();
		} finally {
			sessionFactory.close();
		}
	}
}

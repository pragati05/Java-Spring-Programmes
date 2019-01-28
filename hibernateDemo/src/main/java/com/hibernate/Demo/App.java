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
public class App {
	public static void main(String[] args) {
		Student student1 = new Student("Prags", "Nai", "p@n.com");
		Student student2 = new Student("Rohit", "Shende", "r@s.com");
		Student student3 = new Student("Jovita", "Charney", "j@c.com");

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
			System.out.println("student: " + student2);
			System.out.println("student: " + student3);
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			/*Step 4: Commit the changes*/
			transaction.commit();

			Student retriveObject = (Student) session.get(Student.class, 0);
			System.out.println("retriveObject: " + retriveObject);
		} finally {
			sessionFactory.close();
		}
	}
}

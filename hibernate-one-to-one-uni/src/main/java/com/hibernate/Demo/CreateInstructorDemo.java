package com.hibernate.Demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateInstructorDemo {
	public static void main(String[] args) {

		/* Step 1 : Create SessionFactory */
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).buildSessionFactory();

		/* Step 2: Create Session */
		Session session = sessionFactory.getCurrentSession();

		try {
			Instructor tempInstructor = new Instructor("Chad", "Dardy", "luv2code@gmail.com");
			InstructorDetails tempDetails = new InstructorDetails("www.youtube.com", "Coding");
			
			// Associate the 2 Objects with Other
			tempInstructor.setInstructorDetails(tempDetails);
			
			/* Step 3: Start Transaction */
			Transaction transaction = session.beginTransaction();
			
			InstructorDetails tempInstructoeDetails =  (InstructorDetails) session.get(InstructorDetails.class, 2);
			
		//System.out.println("Instructor of ID 1: " + tempInstructoeDetails.getInstructor());
			/* Note : This will save theInstructorDetails Object too
			 * Becz Cascade is ALL.
			 * */
			session.save(tempInstructor);

			/* Step 4: Commit the changes */
			transaction.commit();
 
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			List<Instructor> instructorList = session.createQuery("from Instructor").list();
			System.out.println("Instructor: " + instructorList);
			transaction.commit();
			
			
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}

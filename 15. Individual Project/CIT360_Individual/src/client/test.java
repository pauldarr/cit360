/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import model.Contact;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author pauldarr
 */
public class test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Contact contact = new Contact();
                contact.setId(1);
		contact.setFirstName("Joseph");
		contact.setLastName("Smith");
		contact.setEmail("joseph.smith@gmail.com");
		contact.setPhone("210-867-5309");
                contact.setAddress("123 Main Street");
                contact.setCompany("Office of the President");

		Transaction tx = session.beginTransaction();
		session.save(contact);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}
}

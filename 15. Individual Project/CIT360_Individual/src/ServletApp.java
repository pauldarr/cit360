import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Contact;

import java.io.PrintWriter;
import java.util.ArrayList;

public class ServletApp extends HttpServlet { 
  protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
    // reading the user input in .jsp
    String firstName = request.getParameter("firstName"); 
    String lastName = request.getParameter("lastName"); 
    String email = request.getParameter("email"); 
    String phone = request.getParameter("phone"); 
    String address = request.getParameter("address"); 
    String company = request.getParameter("company"); 
    
    // begins Hibernate
	Configuration cfg = new Configuration();
	cfg.configure("Hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
    // writes to contact class
    Contact contact = new Contact();
    contact.setFirstName(firstName);
    contact.setLastName(lastName);
    contact.setEmail(email);
    contact.setPhone(phone);
    contact.setAddress(address);
    contact.setCompany(company);

    // writes to MySQL
	Transaction tx = session.beginTransaction();
	session.save(contact);
	System.out.println("Object saved successfully.....!!");
	tx.commit();
	session.close();
	factory.close();    
	
    // reads from contact
    firstName = contact.getFirstName();
    lastName = contact.getLastName();
    email = contact.getEmail();
    phone = contact.getPhone();
    address = contact.getAddress();
    company = contact.getCompany();
    
    // re-reads from java Contact class and prints to console 
    System.out.println ("First name stored in class: "+ contact.getFirstName() ); 
    System.out.println ("Last name stored in class: "+ contact.getLastName() ); 
    System.out.println ("Email stored in class: "+ contact.getEmail() ); 
    System.out.println ("Phone stored in class: "+ contact.getPhone() ); 
    System.out.println ("Address stored in class: "+ contact.getAddress() ); 
    System.out.println ("Company name stored in class: "+ contact.getCompany() ); 
    
    // displays on local host
    PrintWriter out = response.getWriter();
    out.println (
      "<!DOCTYPE html>\n" +
      "<html> \n" +
        "<head> \n" +
          "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \n" +
          "<title>CIT360 - Servlet Input</title> \n" +
        "</head> \n" +
        "<body> \n" +
          "First Name: " + firstName + "</font><br /> \n" +
          "Last Name: " + lastName + "</font><br /> \n" +
          "Email: " + email + "</font><br /> \n" +
          "Phone: " + phone + "</font><br /> \n" +
          "Address: " + address + "</font><br /> \n" +
          "Company: " + company + "</font><br /> \n" +
        "</body> \n" +
      "</html>" 
    );  
  }  
}

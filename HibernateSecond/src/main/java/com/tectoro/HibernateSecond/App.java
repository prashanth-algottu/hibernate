package com.tectoro.HibernateSecond;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello !" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
       // System.out.println(factory);
        
     /*   Details d = new Details(6, "latha");
        System.out.println(d);
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction(); */
        
        // If you want to save a image this is the process
       // FileInputStream inputStream = new FileInputStream("src/main/java/sree.jpg");
        //byte[] data = new byte[inputStream.available()];
        //inputStream.read();
        //d.setImg(data);
        
        
    /*    session.save(d);
        transaction.commit(); */
        
        // If you want to fetch values 
        // take session as previous , we can do it by using session
        Session session = factory.openSession();
        // get()
        Details details = session.get(Details.class, 1); 
        System.out.println(details);
        
        Details details1 = session.get(Details.class, 1000); // gives null
        System.out.println(details1);
        
        // load()
        
        Details load = session.load(Details.class, 2);  
        System.out.println(load);
        
        Details load1 = session.load(Details.class, 1002); // gives ObjectNotFoundException 
        System.out.println(load1);
        
        
    }
}

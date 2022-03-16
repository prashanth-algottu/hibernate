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
        
        Details d = new Details(1, "chinnu");
        System.out.println(d);
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        FileInputStream inputStream = new FileInputStream("src/main/java/sree.jpg");
        byte[] data = new byte[inputStream.available()];
        
        inputStream.read();
        d.setImg(data);
        session.save(d);
        transaction.commit();
        
    }
}

package com.gc.spring.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory factory = buildSessionFactory();

    public static SessionFactory buildSessionFactory(){
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        return cfg.buildSessionFactory();
    }

    public static Session getSession(){
        Session session = factory.openSession();
        session.beginTransaction();
        return session;
    }

}

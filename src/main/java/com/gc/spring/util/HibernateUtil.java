package com.gc.spring.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {



    public static Session buildSessionFactory(){
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session session = sessionFact.openSession();
        session.beginTransaction();
        return session;
    }

    public static Session getSession(){
        Session factory = buildSessionFactory();
        return factory;
    }
}

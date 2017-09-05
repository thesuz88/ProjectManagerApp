package com.gc.spring.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory factory = buildSessionFactory();

    public static SessionFactory buildSessionFactory(){
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        return cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return factory;
    }
}

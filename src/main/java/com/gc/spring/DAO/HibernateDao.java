package com.gc.spring.DAO;

import com.gc.spring.tables.UsersEntity;
import com.gc.spring.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateDao implements Dao {

    private static SessionFactory sessionFactory;

    public HibernateDao (){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<UsersEntity> findAll() {
        return null;
    }

    public List<UsersEntity> findById() {
        return null;
    }

    public List<UsersEntity> findByUsername() {
        return null;
    }

    public void insertUser(UsersEntity user) {
        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

    }

    public void updateUser(UsersEntity user) {

    }

    public void deleteUser(UsersEntity user) {

    }
}

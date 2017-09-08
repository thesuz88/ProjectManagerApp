package com.gc.spring.DAO;

import com.gc.spring.tables.UsersEntity;
import com.gc.spring.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class HibernateDao implements Dao {


    public List<UsersEntity> findAll() {
        return null;
    }

    public List<UsersEntity> findById(@RequestParam("username")String username) {

        Session session = HibernateUtil.getSession();

        Query query = session.createQuery("FROM UsersEntity WHERE username= :username");
        query.setParameter("username", username);
        List<UsersEntity> user = (List<UsersEntity>) query.getResultList();

        return user;
    }

    public List<UsersEntity> findByUsername() {
        return null;
    }

    public void insertUser(UsersEntity user) {
//        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = HibernateUtil.getSession();
        session.save(user);
        session.getTransaction().commit();

    }

    public void updateUser(UsersEntity user) {

    }

    public void deleteUser(UsersEntity user) {

    }
}

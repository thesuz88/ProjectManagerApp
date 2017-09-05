package com.gc.spring.controller;

import com.gc.spring.DAO.Dao;
import com.gc.spring.DAO.HibernateDao;
import com.gc.spring.tables.UsersEntity;
import factory.DAOFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Steve on 7/21/2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() {
        return new
                ModelAndView("homepage", "message", "Hello World");
    }

    @RequestMapping("/gotologin")
    public ModelAndView goToLogin(){
        return new ModelAndView("login","","");
    }


    @RequestMapping("/login")
    public ModelAndView login(){

        return new ModelAndView("profile","","");

    }
    @RequestMapping("/gotoregister")
    public ModelAndView goToRegister(){
        return new ModelAndView("register","","");
    }

    @RequestMapping("/registeruser")
    public ModelAndView register(UsersEntity user, Model model, @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
                                 @RequestParam("username")String username, @RequestParam("email")String email, @RequestParam("type")String type,
                                 @RequestParam("phonenumber") String phonenumber, @RequestParam("password")String password){

        Dao dao = DAOFactory.getInstance(DAOFactory.HIBERNATE);

        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setUsername(username);
        user.setUserEmail(email);
        user.setPassword(password);
        user.setUserType(type);
        user.setPhoneNumber(phonenumber);

        dao.insertUser(user);

        return new ModelAndView("profile","username",user.getUsername());
    }

}


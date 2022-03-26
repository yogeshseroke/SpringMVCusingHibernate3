package com.scs.bao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.scs.dao.Emp;
@Controller
public class EmployeeController {
@RequestMapping("/empex")
public ModelAndView empload(){
	return new ModelAndView("empview","command",new Emp());
}
@RequestMapping("/emplogic")
public ModelAndView emplogic(@ModelAttribute("jobportal")Emp s){
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session sess = sf.openSession();
	Transaction tx= sess.beginTransaction();
	sess.save(s);
	tx.commit();
	sess.close();
	ModelAndView obj=new ModelAndView("empview","command",new Emp());
	obj.addObject("res", "Data Inserted Successfully ");
	return obj;
}
}

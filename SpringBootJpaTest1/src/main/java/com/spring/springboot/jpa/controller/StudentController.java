package com.spring.springboot.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springboot.jpa.dao.StudentRepo;
import com.spring.springboot.jpa.model.Student;

@Controller
public class StudentController {

	@Autowired
	StudentRepo repo;

//	@RequestMapping("/")
//	public String home() {
//		return "home.jsp";
//	}

	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		repo.save(student);
		return "home.jsp";
	}
	
	@RequestMapping("/showrecord")
	public ModelAndView showrecord(@RequestParam int studId) {
		System.out.println("Inside showrecord...........");
		 ModelAndView mv=new ModelAndView("showrecord.jsp");
		 Student student=repo.findById(studId).orElse(new Student());
		 System.out.println("ModelAndView for student :-" + student);
		 mv.addObject(student);
		return mv;
	}

}

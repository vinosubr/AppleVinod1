package com.telusko.session8;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@ModelAttribute("alien5")
	public Alien getAlien()
	{
		Alien alien = new Alien();
		alien.setAid(101);
		alien.setAname("A");
		alien.setAge(20);
		
		return alien;
	}
	
	@RequestMapping("/")
	public String home(HttpSession session){
		session.setAttribute("test", "Hello World");
		return "home";
	}
	
	
	@PostMapping("/add")
	public ModelAndView addAlien(@ModelAttribute("alien") Alien alien,ModelAndView mv,HttpSession session) {
		//Get the Collection from Session. If present use it otherwise add it
		Aliens aliens = null;
		if(session.getAttribute("aliens") == null) {
			aliens = new Aliens();
		}else {
			aliens = (Aliens)session.getAttribute("aliens");			
		}
		aliens.add(alien);	
		session.setAttribute("aliens", aliens);
		//mv.addObject("aliens", aliens);
		mv.setViewName("home");
		return mv;
	}
}

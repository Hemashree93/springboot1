package com.example.demo.xworkz.logincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginController {

	public LoginController() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("hema")
	public String onLogin() {
		System.out.println("invoked onLogin");
		return "index.jsp";
	}
	
	@RequestMapping("success")
	public String onSuccess(@RequestParam String name, @RequestParam String message,Model model) {
	
	System.out.println("invoked onSuccess()");
	System.out.println("Name is :"+name);
	System.out.println("Message is :"+message);
	model.addAttribute("name", name);
	model.addAttribute("message", message);
	return "success.jsp";
	
	}
	
}


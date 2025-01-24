package com.employee.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.employee.entities.User;
import com.employee.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController 
{
	@Autowired
        private UserService userService;

	    @RequestMapping("/ems")
	    public String redirectToAppropriatePage(HttpSession session) 
	    {
		User currentUser = (User) session.getAttribute("currentUser");

	        if (currentUser == null) 
	        {
	            return "Signup";
	        } 
	        else 
	        {	           
	            return "Employee_Form";
	        }
	    }

	    @RequestMapping("/signup")
	    public String signupForm(HttpSession session) 
	    {	       
	        User currentUser = (User) session.getAttribute("currentUser");

	        if (currentUser != null) 
	        {	            
	            return "Employee_Form";
	        }	        
	        return "Signup";
	    }

	    @RequestMapping("/register")
	    public String registerUser(@ModelAttribute("user") User user) 
	    {	       
	        userService.saveUser(user);
	        return "Login"; 
	    }

	    @RequestMapping("/login")
	    public String loginForm() 
	    {
	        return "Login";  
	    }

	    @RequestMapping("/loginUser")
	    public String loginUser(@RequestParam("username") String username,
	                            @RequestParam("password") String password,
	                            HttpSession session,
	                            RedirectAttributes redirectAttributes) 
	    {

	        User user = userService.validateUser(username, password);

	        if (user != null) 
		{	            
	            session.setAttribute("currentUser", user);
	            return "Employee_Form"; 
	        }
		else 
		{
	            redirectAttributes.addFlashAttribute("errorMessage", "Invalid credentials. Please try again.");
	            return "Login";
	        }
	    }

	    @RequestMapping("/logout")
	    public String logout(HttpSession session) 
	    {
	        session.invalidate(); 
	        return "Login"; 
	    }

}

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
	        // Check if the user is already logged in (session attribute check)
	        User currentUser = (User) session.getAttribute("currentUser");

	        if (currentUser == null) 
	        {
	            // If no user is logged in, it is a new user, redirect to sign-up
	            return "Signup";
	        } 
	        else 
	        {
	            // If user is already logged in, redirect to Employee Form
	            return "Employee_Form";
	        }
	 }

	    @RequestMapping("/signup")
	    public String signupForm(HttpSession session) 
	    {
	        // Check if the user is already logged in (session attribute check)
	        User currentUser = (User) session.getAttribute("currentUser");

	        if (currentUser != null) 
	        {
	            // If already logged in, redirect to Employee Form
	            return "Employee_Form";
	        }
	        // Otherwise, show the signup page
	        return "Signup";
	    }

	    @RequestMapping("/register")
	    public String registerUser(@ModelAttribute("user") User user) {
	        // Save the user
	        userService.saveUser(user);

	        // After successful sign-up, redirect to login page
	        return "Login"; // Redirect to the login page
	    }

	    @RequestMapping("/login")
	    public String loginForm() {
	        return "Login";  // Display the login page
	    }

	    @RequestMapping("/loginUser")
	    public String loginUser(@RequestParam("username") String username,
	                            @RequestParam("password") String password,
	                            HttpSession session,
	                            RedirectAttributes redirectAttributes) {

	        User user = userService.validateUser(username, password);

	        if (user != null) {
	            // Store user in session to track logged-in user
	            session.setAttribute("currentUser", user);

	            // After successful login, redirect to Employee Form
	            return "Employee_Form";  // Redirect to Employee Form page
	        } else {
	            redirectAttributes.addFlashAttribute("errorMessage", "Invalid credentials. Please try again.");
	            return "Login";  // Redirect back to login if credentials are invalid
	        }
	    }

	    @RequestMapping("/logout")
	    public String logout(HttpSession session) {
	        session.invalidate(); // Invalidate the session to log out
	        return "Login"; // Redirect to the login page after logout
	    }

}

package in.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg()
	{
		ModelAndView m1=new ModelAndView();
		m1.addObject("msg", "Hello welcome to the Patel family!!!");
		m1.setViewName("message");
		return m1;
	}
	
	@GetMapping("/greetings")
	public ModelAndView getGreetMsg()
	{
		ModelAndView m1=new ModelAndView();
		m1.addObject("msg","Greetings from Patel family!!!");
		m1.setViewName("message");
		return m1;
	}

}

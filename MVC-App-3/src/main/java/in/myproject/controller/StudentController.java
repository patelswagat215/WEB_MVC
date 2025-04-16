package in.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import in.myproject.Service.StudentService;
import in.myproject.binding.Student;


@Controller
public class StudentController {
	@Autowired
	private StudentService pref;
	
	
	@GetMapping("/")
	public String loadIndexPage(Model model)
	{
		initializations(model);
		return "index";
	}

	
	@PostMapping("/save")
	public String saveStudent(Student s,Model model)
	{
		initializations(model);
		//Form data captured and will insert in DB.
		//System.out.println(s);
		if(pref.saveStudent(s))
		{
			model.addAttribute("success", "Record inserted successfully...");
		}
		
		return "index";
	}
	
	//	form init method
	private void initializations(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("timingOptions", pref.getTimings());
	    model.addAttribute("courseOptions",pref.getCourses());
	}
	

}

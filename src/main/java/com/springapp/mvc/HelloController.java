package com.springapp.mvc;

import com.springapp.mvc.dto.SampleDTO;
import com.springapp.mvc.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {


	@Autowired
	SampleService sampleService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {


		sampleService.pleaseLogMe(10,"Gamble", new SampleDTO());

		model.addAttribute("message", "Hello world!");
		return "hello";



	}
}
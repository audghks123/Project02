package kh.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	@Autowired
	private OutputService oService;

	@RequestMapping("/")
	public String home(Locale locale, Model model) {


		return "home";
	}

	@RequestMapping("output.io")
	public String output(Model model) {
		System.out.println("output 요청 확인");
		List<PersonDTO> list = oService.select();
		model.addAttribute("list", list);
		return "output";	
	}
}
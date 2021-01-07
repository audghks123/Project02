package kh.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import kh.spring.dto.PersonDTO;
import kh.spring.service.InputService;

@Controller
public class HomeController {
	
	@Autowired
	private InputService iService;
  
	@Autowired
	private OutputService oService;

	@RequestMapping("/")
	public String home() {	
		return "home";
	}
	@RequestMapping("input.io")
	public String input() {
		return "input";
	}
	@RequestMapping("inputDB")
	public String inputDB(HttpServletRequest request) {
	 String writer = request.getParameter("writer");
	 String title =	request.getParameter("title");
	 PersonDTO dto = new PersonDTO();
	 dto.setWriter(writer);
	 dto.setTitle(title);
	 iService.insert(dto);
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

package kh.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dto.PersonDTO;
import kh.spring.service.InputService;



@Controller
public class HomeController {
	
	@Autowired
	private InputService iService;
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
	
}

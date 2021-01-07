package kh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.dao.OutputDAO;

@Service
public class OutputService {
	
	@Autowired
	private OutputDAO odao;
	
	public List<PersonDTO> select()throws Exception{
		return odao.select();
	}

}

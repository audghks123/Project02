package kh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.dao.OutputDAO;
import kh.spring.dto.PersonDTO;

@Service
public class OutputService {
	
	@Autowired
	private OutputDAO odao;
	
	public List<PersonDTO> selectList()throws Exception{
		return odao.selectList();
	}

}

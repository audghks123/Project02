package kh.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.vo.MembersVO;

@Repository
public class PersonDAO {
	@Autowired
	private SqlSession db;
	
	public int insert(PersonDTO dto)throws Exception{
		return db.insert("Person.insert",dto);
		}
	public PersonDTO select()throws Exception{
		return db.select("Person.select");
	}

}

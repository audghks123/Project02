package kh.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
	public List<PersonDTO> selectList()throws Exception{
		return db.selectList("Person.select");
	}

}

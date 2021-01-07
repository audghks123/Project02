package kh.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OutputDAO {
	@Autowired
	private SqlSession db;
	

	public List<PersonDTO> select()throws Exception{
		return db.selectList("Person.selectlist");
	}

}

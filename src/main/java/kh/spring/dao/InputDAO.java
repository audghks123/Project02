package kh.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.dto.PersonDTO;

@Repository
public class InputDAO {
   @Autowired
   private SqlSession session;
   
   public int insert(PersonDTO dto) {
      return session.insert("input.insert",dto);
   }
}
package com.test.ksg;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSession; // Oracle Sql ������ü (�α���--> ���� ������ ���)

	public boolean insert(MemberVo vo) { 
		
		return sqlSession.insert("my_mapper.insertMember", vo) == 1;
		
	}

}

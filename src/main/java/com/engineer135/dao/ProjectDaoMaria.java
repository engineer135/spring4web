package com.engineer135.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDaoMaria implements ProjectDao {
	
	@Autowired
	private SqlSession query;
	
	@Override
	public void test() {
		query.selectOne("maria.test");
	}

	@Override
	public int add(HashMap<String, Object> map) {
		return query.insert("maria.insert", map);
	}

	/*// Mybatis 이용
	SqlSessionFactory sqlSessionFactory;
	
	@Override
	public int add(HashMap<String, Object> map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try{
			int count = sqlSession.insert("mariaDb.insertUser", map);
			sqlSession.commit();
			return count;
		}finally{
			sqlSession.close();
		}
	}*/

}

package com.yongdam.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTest {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testDataSource() {
		
		try {
			Connection con = dataSource.getConnection();
			
			System.out.println(con+" dataSource 연결 성공");
		} catch (Exception e) {
			System.out.println("dataSource 연결 실패");
			e.printStackTrace();
		}
	}
	@Test
	public void testMyBatis() {
	

		SqlSession session = sqlSessionFactory.openSession();
		try {
			
		session.getConnection();
		System.out.println("session="+session);
		
		}catch (Exception e) {
			
			System.out.println("session Test 실패"+session);
			e.printStackTrace();
		}
	}
	
}

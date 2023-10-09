package com.yongdam.persistence;

import java.sql.DriverManager;

import org.junit.Test;

public class JdbcTest {

	
	@Test
public void ConnTest() {
		try {
		
			DriverManager.getConnection("jdbc:mysql://localhost:3306/mit"
					, "root", "1234");
			
			System.out.println("MySQL 연결 성공");
		} catch (Exception e) {
			System.out.println("MySQL 연결 실패!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}

}

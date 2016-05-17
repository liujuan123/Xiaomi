package com.yc.login.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnTest {

	@Test
	public void testConn() {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		DataSource source = (DataSource) cxt.getBean("dataSource");
		Connection connection = null;
		
		try {
			connection = source.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		assertNotNull(connection);
	}
	
	@Test
	public void testConn02() {
		Connection connection = null;
		
		try {
			ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
			SqlSessionFactory factory = (SqlSessionFactory) cxt.getBean("sqlSessionFactory");
			SqlSession session = factory.openSession();
			connection = session.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertNotNull(connection);
	}

}

package org.practice.springDao.daoimpl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class SimpleJdbcDaoImpl extends SimpleJdbcCall{

	public SimpleJdbcDaoImpl(JdbcTemplate jdbcTemplate) {
		super(jdbcTemplate);
		// TODO Auto-generated constructor stub
	}

	

}

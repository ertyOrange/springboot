/**
 * 
 */
/**
 * @author yy263
 *
 */
package com.example.jdbc.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyBeanJdbcTemplate {
	
	private final JdbcTemplate jdbcTemplate;

	//private  javax.persistence.EntityManager  EntityManager ;
	
	public MyBeanJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// ...

	public String start() {
		
		jdbcTemplate.execute("delete from orders where Id_O='3'");
		return "good jdbcTemplate";

	}

}
/**
 * 
 */
/**
 * @author yy263
 *
 */
package com.example.jdbc.template;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyBeanNamedParameterJdbcTemplate {
	
	private final NamedParameterJdbcTemplate namedParameterJdbcTemplate ;

	public MyBeanNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public String start() {
		
		namedParameterJdbcTemplate.getJdbcOperations().execute("delete from orders where Id_O='4'"); 
		return "good namedParameterJdbcTemplate";

	}

}
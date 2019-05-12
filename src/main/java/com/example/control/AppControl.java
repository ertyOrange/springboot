/**
 * 
 */
/**
 * @author yy263
 *
 */
package com.example.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.YmlConfig;
import com.example.jdbc.template.MyBeanJdbcTemplate;
import com.example.jdbc.template.MyBeanNamedParameterJdbcTemplate;

@RestController
@ConfigurationProperties(prefix="myYml")
public class AppControl{
	@Autowired
	private YmlConfig config;
	
	@Value("${my.name}")
	private String name;
	
	@Autowired
	private MyBeanJdbcTemplate myBean;
	
	@Autowired
	private MyBeanNamedParameterJdbcTemplate myBeanNamedParameterJdbcTemplate;
	
	@RequestMapping("/home") 
	 String getNameFromPro(){
		return "property name :"+this.name;
	}
	

	
	@RequestMapping("/myYml")
	String getMyYml(){
		return "property name :"+config.getSimpleProp()+"\n"+
		"property name :"+config.getArrayProps();
	}
	
	
	
	@RequestMapping("/jdbcTemplate")
	String getjdbcTemplate(){
		
		return myBean.start();
	}
	
	@RequestMapping("/namedParameterJdbcTemplate")
	String getnamedParameterJdbcTemplate(){
		
		return myBeanNamedParameterJdbcTemplate.start();
	}
}
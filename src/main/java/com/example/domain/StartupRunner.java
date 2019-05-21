package com.example.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=1)
public class StartupRunner implements ApplicationRunner {
	
	  protected final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

  
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		logger.info(">>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
		
	}

}
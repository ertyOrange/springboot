package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.domain.StartupRunner;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example","config","com.jdbc.template"})
//@SpringBootApplication
public class Application {
	


    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);
    	
    	SpringApplication springApplication=new SpringApplication(Application.class);
    	
    	//If you do not want command line properties to be added to the Environment, you can disable them by using 
    	//springApplication.setAddCommandLineProperties(false);
    	springApplication.run(args);   
    }
    
    //在应用启动之前就可以加载下面的方法
    
//    @Bean
//    public StartupRunner schedulerRunner() {
//        return new StartupRunner();
//    }

}


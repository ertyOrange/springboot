package com.example.eventLisenter;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(value=2)
public class RegisterListener  implements ApplicationListener<UserRegisterEvent>{

	@Override
	public void onApplicationEvent(UserRegisterEvent  userRegisterEvent) {
		   //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("@RegisterListener注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
		
	}

}

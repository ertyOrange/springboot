package com.example.eventLisenter;


import lombok.Data;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/21
 * Time：10:05
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class UserBean
{
    //用户名
    private String name;
    //密码
    private String password;
	public UserBean(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
    
}

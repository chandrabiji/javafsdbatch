package com.chansra.dao;

import com.chansra.bean.Users;

public interface UserDAO {
	
	public String register(Users user);
	public String login(String userName,String passWord);
	public String forgot(String userName,String type);

}

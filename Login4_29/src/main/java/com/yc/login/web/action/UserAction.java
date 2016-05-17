package com.yc.login.web.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.login.entity.User;
import com.yc.login.service.UserService;


@Controller("userAction") //定义bean  bean的名字是userAction
public class UserAction implements ModelDriven<User> {
	
	@Autowired  //自动给属性注值，默认属性名与bean的名字一致，才能注入
	private UserService userService;
	private User user;
	
	/*public UserAction(){
		System.out.println("UserAction我出世了");
	}*/
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String login(){
		if(userService.login(user)){
			return "success";
		}else {
			return "fail";
		}
	}

	@Override
	public User getModel() {
		user = new User(); 
		return user;
	}

}

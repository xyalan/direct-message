package com.hialan.dm.controller;

import com.hialan.dm.entity.User;
import com.hialan.dm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * User: Alan
 * Email: houlong.yang@shuyun.com
 * Date: 12:34 AM 8/08/2017
 */
@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = POST)
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}

	@RequestMapping(method = GET)
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@RequestMapping(path = "token", method = POST)
	public void issueToken() {

	}
}

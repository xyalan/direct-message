package com.hialan.dm.service;

import com.hialan.dm.entity.User;
import com.hialan.dm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Alan
 * Email: houlong.yang@shuyun.com
 * Date: 12:38 AM 8/08/2017
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	public void createUser(User user) {
		userRepository.save(user);
	}
}

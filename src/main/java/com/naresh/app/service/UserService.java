package com.naresh.app.service;

import com.naresh.app.model.User;

public interface UserService {

	 User findByUsernameOrEmail(String usernameOrEmail);
}
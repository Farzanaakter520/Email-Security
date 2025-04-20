package org.isdb.email.controller;

import org.isdb.email.annotation.CurrentUser;
import org.isdb.email.model.CustomUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	public CustomUser user(@CurrentUser CustomUser currentUser) {
		return currentUser;
	}
}
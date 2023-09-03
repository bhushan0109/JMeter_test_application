package com.boot.rest.base.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.boot.rest.base.model.User;
import com.boot.rest.base.service.UserService;

@RestController
@RequestMapping(value = "user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	// save single of users
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public User registerUser(@RequestBody User userVO) {

		return this.userService.insert(userVO);
	}

	// save list of users
	@PostMapping("/save/all/dummylist/users")
	@ResponseStatus(value = HttpStatus.CREATED)
	public List<User> registerListUser(@RequestBody User userVO) {

		return this.userService.registerListUser(userVO);
	}

	@GetMapping("/find/all/users")
	@ResponseStatus(value = HttpStatus.OK)
	public List<User> findAllUser() {
		LOGGER.info("Thread name==>" + Thread.currentThread().getName());

		return this.userService.findAll();
	}

	@GetMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public User findById(@PathVariable int id) {
		LOGGER.info("Thread name==>" + Thread.currentThread().getName());
		return this.userService.findById(id);
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public User updateUser(@PathVariable int id, @RequestBody User userVO) {

		return this.userService.updateUser(id, userVO);
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable int id) {

		this.userService.delete(id);
	}
}

package com.washcar.firstproject.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.washcar.firstproject.entity.WashUser;
import com.washcar.firstproject.repository.IWashUserRepository;

/**
 * @author Gustavo
 *
 */
@RestController
public class WashUserRestController {

	@Autowired
	private IWashUserRepository washUserRepository;

	@RequestMapping(value = "findAll")
	public Iterable<WashUser> findAllWashUser() {
		return washUserRepository.findAll();
	}

	@RequestMapping(value = "findById")
	public WashUser findWashUserById(@RequestParam(name = "id", required = true) Long id) {
		return washUserRepository.findOne(id);
	}

	@RequestMapping(value = "createWashUser")
	public WashUser createWashUser(@RequestParam(name = "firstName", required = true) String firstName,
			@RequestParam(name = "email", required = true) String email) {
		return washUserRepository.save(new WashUser().setFirstName(firstName).setEmail(email));
	}

}

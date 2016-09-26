package com.sample.firstproject.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.firstproject.entity.SampleUser;
import com.sample.firstproject.repository.ISampleUserRepository;

/**
 * @author Gustavo
 *
 */
@RestController(value = "/server/user")
public class SampleUserRestController {

	@Autowired
	private ISampleUserRepository sampleUserRepository;

	@RequestMapping(value = "/server/user", method = RequestMethod.GET)
	public Iterable<SampleUser> findAllSampleUser() {
		return this.sampleUserRepository.findAll();
	}

	@RequestMapping(value = "/server/user", method = RequestMethod.GET, params = { "id" })
	public SampleUser findSampleUserById(@RequestParam(name = "id", required = true) Long id) {
		return this.sampleUserRepository.findOne(id);
	}

	@RequestMapping(value = "/server/user", method = RequestMethod.POST)
	public SampleUser saveSampleUser(@RequestParam(name = "id", required = false) Long id,
			@RequestParam(name = "firstName", required = true) String firstName,
			@RequestParam(name = "email", required = true) String email) {
		return this.sampleUserRepository.save(new SampleUser().setId(id).setFirstName(firstName).setEmail(email));
	}

	@RequestMapping(value = "/server/user", method = RequestMethod.DELETE)
	public void deleteSampleUser(@RequestParam(name = "id", required = true) Long id) {
		this.sampleUserRepository.delete(id);
	}
}
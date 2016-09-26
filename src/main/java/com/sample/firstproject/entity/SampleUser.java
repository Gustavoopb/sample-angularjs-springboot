package com.sample.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Email;

/**
 * @author Gustavo
 *
 */
@Entity
public class SampleUser extends BaseEntity {

	private static final long serialVersionUID = -8001665107001675564L;

	@Column
	private String firstName;

	@Email
	@Column
	private String email;

	public SampleUser setId(Long id) {
		super.setId(id);
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public SampleUser setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public SampleUser setEmail(String email) {
		this.email = email;
		return this;
	}

}

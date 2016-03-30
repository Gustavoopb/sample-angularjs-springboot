package com.washcar.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Email;

/**
 * @author Gustavo
 *
 */
@Entity
public class WashUser extends BaseEntity {

	private static final long serialVersionUID = -8001665107001675564L;

	@Column
	private String firstName;

	@Email
	@Column
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public WashUser setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public WashUser setEmail(String email) {
		this.email = email;
		return this;
	}

}

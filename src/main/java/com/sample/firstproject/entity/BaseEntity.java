package com.sample.firstproject.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Gustavo
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 5905761477181835764L;

	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public BaseEntity setId(Long id) {
		this.id = id;
		return this;
	}
}

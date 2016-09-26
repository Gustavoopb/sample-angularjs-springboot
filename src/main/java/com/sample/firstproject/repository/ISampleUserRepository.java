package com.sample.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.firstproject.entity.SampleUser;

/**
 * @author Gustavo
 *
 */
@Repository
public interface ISampleUserRepository extends CrudRepository<SampleUser, Long> {
}
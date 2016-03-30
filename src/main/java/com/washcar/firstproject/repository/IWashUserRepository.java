package com.washcar.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.washcar.firstproject.entity.WashUser;

/**
 * @author Gustavo
 *
 */
@Repository
public interface IWashUserRepository extends CrudRepository<WashUser, Long> {
}
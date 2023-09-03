package com.boot.rest.base.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.rest.base.model.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
	
}

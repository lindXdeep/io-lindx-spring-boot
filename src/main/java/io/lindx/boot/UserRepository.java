package io.lindx.boot;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.lindx.boot.rest.User;

public interface UserRepository extends CrudRepository<User, Integer> {
  
  List<User> findAll();
}

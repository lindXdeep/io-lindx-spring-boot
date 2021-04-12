package io.lindx.boot.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.lindx.boot.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  
}

package io.lindx.boot.service;

import org.springframework.stereotype.Service;

import io.lindx.boot.model.User;
import io.lindx.boot.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public User getUser(final Long id) {
    
    return userRepository.getById(id);
  }
  
}

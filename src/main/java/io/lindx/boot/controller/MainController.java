package io.lindx.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.lindx.boot.model.User;
import io.lindx.boot.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {

  private final UserService userService;

  @GetMapping("/hello/{id}")
  public User hello(final @PathVariable Long id) {
    
    return userService.getUser(id);
  }
}

package io.lindx.boot.controllers;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.lindx.boot.models.User;

@RestController
public class MainController {

  @GetMapping("/user")
  public List<User> hello() {
    return Collections.singletonList(
      new User(){
        {
          setId(1L);
          setName("User");
        }
      }
    );
  }
}

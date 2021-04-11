package io.lindx.boot.rest;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 */
@RestController
public class Controller {

  @GetMapping("/users")
  public List<User> users(){

    return Collections.singletonList(
      
     new User("o1", "User")
      
    );
  }
}
package io.lindx.boot.rest;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.lindx.boot.UserRepository;

/**
 * Controller
 */
@RestController
public class Controller {

  private UserRepository userRepository;


  public Controller(UserRepository userRepository) {

    this.userRepository = userRepository;

    User user = new User();
      user.setId("02");
      user.setName("Tom");

    userRepository.save(user);
  }


  @GetMapping("/users")
  public List<User> users(){

    return userRepository.findAll().stream()
            .map(
              user -> new User() {{
                setId("" + user.getId());
                setName(user.getName());
              }} 

            ).collect(Collectors.toList());
  }
}
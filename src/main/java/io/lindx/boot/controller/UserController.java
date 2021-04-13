package io.lindx.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.lindx.boot.model.Role;
import io.lindx.boot.model.User;
import io.lindx.boot.repository.UserRepository;
import io.lindx.boot.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;
  private final UserRepository userRepository;

  @GetMapping("/user/{id}")
  public User hello(final @PathVariable Long id) {
    
    userRepository.save(new User() {
      {
        setEmail("email@email");
        setPassword("12345");
        setRoles(new Role(){
          {
            setRole_name("ADMIN");
          }
        });
      }
    });


    System.out.println(userService.getUser(id));

    return userService.getUser(id);
  }
}

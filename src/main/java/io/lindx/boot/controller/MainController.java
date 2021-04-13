package io.lindx.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping(value = "/")
  public String hello() {
    return "Hello from Tomcat";
  }
}

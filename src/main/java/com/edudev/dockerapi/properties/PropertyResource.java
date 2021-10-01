package com.edudev.dockerapi.properties;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/properties")
public final class PropertyResource {

    @GetMapping
    public String sayHello() { return "Hello from Eduardo J."; }
}

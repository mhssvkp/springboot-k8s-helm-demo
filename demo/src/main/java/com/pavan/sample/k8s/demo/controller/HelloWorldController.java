package com.pavan.sample.k8s.demo.controller;

import com.pavan.sample.k8s.demo.controller.response.HelloWorldResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api/v1/hello")
public interface HelloWorldController {

    @GetMapping
    ResponseEntity<HelloWorldResponse> helloWorld();

    @GetMapping("/error")
    ResponseEntity<HelloWorldResponse> throwError() throws Exception;
}

package com.pavan.sample.k8s.demo.controller;

import com.pavan.sample.k8s.demo.controller.response.HelloWorldResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllerImpl implements HelloWorldController {

    public ResponseEntity<HelloWorldResponse> helloWorld() {
        return new ResponseEntity<HelloWorldResponse>(new HelloWorldResponse("hello world!","success"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HelloWorldResponse> throwError() throws Exception {
        throw new Exception();
    }
}

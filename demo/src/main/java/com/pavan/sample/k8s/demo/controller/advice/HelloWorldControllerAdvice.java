package com.pavan.sample.k8s.demo.controller.advice;

import com.pavan.sample.k8s.demo.controller.response.HelloWorldErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class HelloWorldControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<HelloWorldErrorResponse> genericErrorResponse(Exception ex, WebRequest req){
        return new ResponseEntity<>(new HelloWorldErrorResponse("test","some test exception"), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

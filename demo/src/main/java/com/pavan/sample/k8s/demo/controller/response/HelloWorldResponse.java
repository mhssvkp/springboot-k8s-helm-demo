package com.pavan.sample.k8s.demo.controller.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HelloWorldResponse implements Serializable {

    private String message;
    private String status;
}

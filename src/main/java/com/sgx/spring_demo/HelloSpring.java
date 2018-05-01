package com.sgx.spring_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class HelloSpring {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloSpirng(@RequestParam(value = "id", required = false, defaultValue = "0" ) Integer myID) {

        // List<T_Account> list = new ArrayList<T_Account>();


        return "hellow Spring!" + myID;
    }
}
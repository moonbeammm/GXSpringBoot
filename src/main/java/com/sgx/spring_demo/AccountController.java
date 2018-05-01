package com.sgx.spring_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public List<T_Account> accountList() {
        return accountRepository.findAll();
    }
}
package com.sgx.spring_demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class T_Account {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private String pwd;
    private String city;
    private Integer accesskey;

    public T_Account() {
        
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }
    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @return the accesskey
     */
    public Integer getAccesskey() {
        return accesskey;
    }

}
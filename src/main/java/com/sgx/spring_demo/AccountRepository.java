package com.sgx.spring_demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<T_Account, Integer> {
    
}
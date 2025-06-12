package com.workintech.s19d2.service;

import com.workintech.s19d2.entity.Account;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> findAll();
    Optional<Account> findById(Long id);
    Account save(Account account);
    Account update(Long id,Account account);
    void delete(Long id);
}

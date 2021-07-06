package com.acme.dbo.dao;

import com.acme.dbo.domain.Account;

import java.util.Collection;

public interface Repository<T> {
    T create(T data);
    T findById(Integer id);
    Collection<T> findAll();
}

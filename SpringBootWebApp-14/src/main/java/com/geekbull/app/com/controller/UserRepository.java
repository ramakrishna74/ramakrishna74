package com.geekbull.app.com.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.geekbull.app.com.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

}

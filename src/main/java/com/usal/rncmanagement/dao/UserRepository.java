package com.usal.rncmanagement.dao;

import com.usal.rncmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findAllByOrderByLastNameAsc();

}
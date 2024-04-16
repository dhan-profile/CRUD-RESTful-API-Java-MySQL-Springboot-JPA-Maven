package com.dhan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhan.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{

}

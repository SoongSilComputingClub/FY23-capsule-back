package com.sscc.capsule.repository;

import com.sscc.capsule.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}

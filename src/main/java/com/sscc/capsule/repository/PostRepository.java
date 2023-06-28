package com.sscc.capsule.repository;

import com.sscc.capsule.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

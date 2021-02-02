package com.wannistudio.restapi.repository;

import com.wannistudio.restapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<User, Long> {}

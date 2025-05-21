package com.invoice_management.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoice_management.Entities.UserEntity;

import java.util.Optional;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);

}

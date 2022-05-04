package com.ericeol.bankline.api.repository;

import com.ericeol.bankline.api.model.Movement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovementRepository extends JpaRepository<Movement, Integer> {
    List<Movement> findByAccountId(Integer accountId);
}

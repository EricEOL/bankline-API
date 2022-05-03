package com.ericeol.bankline.api.repository;

import com.ericeol.bankline.api.model.Holder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolderRepository extends JpaRepository<Holder, Integer> {
}

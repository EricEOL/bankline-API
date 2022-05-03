package com.ericeol.bankline.api;

import com.ericeol.bankline.api.dto.HolderDTO;
import com.ericeol.bankline.api.model.Holder;
import com.ericeol.bankline.api.repository.HolderRepository;
import com.ericeol.bankline.api.service.HolderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HolderTest {
    @Autowired
    HolderService holderService;

    @Test
    void add() {
        holderService.add(new HolderDTO("Eric", "111.111.111-01"));
    }
}

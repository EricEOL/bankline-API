package com.ericeol.bankline.api.controller;

import com.ericeol.bankline.api.model.Holder;
import com.ericeol.bankline.api.repository.HolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/holders")
public class HolderController {

    @Autowired
    HolderRepository holderRepository;

    @GetMapping
    public List<Holder> all() {
        return holderRepository.findAll();
    }
}

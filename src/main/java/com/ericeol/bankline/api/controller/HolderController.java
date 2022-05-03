package com.ericeol.bankline.api.controller;

import com.ericeol.bankline.api.dto.HolderDTO;
import com.ericeol.bankline.api.model.Holder;
import com.ericeol.bankline.api.repository.HolderRepository;
import com.ericeol.bankline.api.service.HolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/holders")
public class HolderController {

    @Autowired
    HolderRepository holderRepository;

    @Autowired
    HolderService holderService;

    @GetMapping
    public List<Holder> all() {
        return holderRepository.findAll();
    }

    @PostMapping
    public void add(@RequestBody HolderDTO holderDTO) {
        holderService.add(holderDTO);
    }
}

package com.ericeol.bankline.api.controller;

import com.ericeol.bankline.api.dto.HolderDTO;
import com.ericeol.bankline.api.dto.MovementDTO;
import com.ericeol.bankline.api.model.Holder;
import com.ericeol.bankline.api.model.Movement;
import com.ericeol.bankline.api.repository.HolderRepository;
import com.ericeol.bankline.api.repository.MovementRepository;
import com.ericeol.bankline.api.service.HolderService;
import com.ericeol.bankline.api.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movements")
public class MovementController {

    @Autowired
    MovementRepository movementRepository;

    @Autowired
    MovementService movementService;

    @GetMapping
    public List<Movement> all() {
        return movementRepository.findAll();
    }

    @PostMapping
    public void add(@RequestBody MovementDTO movementDTO) {
        movementService.add(movementDTO);
    }
}

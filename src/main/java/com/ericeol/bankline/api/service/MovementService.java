package com.ericeol.bankline.api.service;

import com.ericeol.bankline.api.dto.MovementDTO;
import com.ericeol.bankline.api.model.Holder;
import com.ericeol.bankline.api.model.Movement;
import com.ericeol.bankline.api.model.MovementType;
import com.ericeol.bankline.api.repository.HolderRepository;
import com.ericeol.bankline.api.repository.MovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MovementService {

    @Autowired
    MovementRepository movementRepository;

    @Autowired
    HolderRepository holderRepository;

    public void add(MovementDTO movementDTO) {
        Movement movement = new Movement();

        Double value =
                movementDTO.getMovementType() == MovementType.RECEITA
                        ? movementDTO.getValue()
                        : movementDTO.getValue() * -1;

        movement.setCreatedAt(LocalDateTime.now());
        movement.setDescription(movementDTO.getDescription());
        movement.setAccountId(movementDTO.getAccountId());
        movement.setMovementType(movementDTO.getMovementType());
        movement.setValue(value);

        Holder holder = holderRepository.findById(movementDTO.getAccountId()).orElse(null);

        if(holder != null) {
            holder.getAccount().setBalance(holder.getAccount().getBalance() + value);
            holderRepository.save(holder);
        }

        movementRepository.save(movement);
    }

}

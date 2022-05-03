package com.ericeol.bankline.api;

import com.ericeol.bankline.api.dto.MovementDTO;
import com.ericeol.bankline.api.model.MovementType;
import com.ericeol.bankline.api.service.MovementService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovementTest {

    @Autowired
    MovementService movementService;

    @Test
    void addDespesa() {
        MovementDTO movementDTO = new MovementDTO(
                "Compra de panda",
                220.0,
                MovementType.DESPESA,
                1
        );

        movementService.add(movementDTO);
    }

    @Test
    void addReceita() {
        MovementDTO movementDTO = new MovementDTO(
                "Compra de panda",
                220.0,
                MovementType.RECEITA,
                1
        );

        movementService.add(movementDTO);
    }
}

package com.ericeol.bankline.api.dto;

import com.ericeol.bankline.api.model.MovementType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovementDTO {
    private String description;
    private Double value;
    private MovementType movementType;
    private Integer accountId;
}

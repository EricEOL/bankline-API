package com.ericeol.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movement {
    private Integer id;
    private LocalDateTime createdAt;
    private String description;
    private Double value;
    private MovementType movementType;
}

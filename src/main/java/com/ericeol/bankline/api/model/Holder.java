package com.ericeol.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Holder {
    private Integer id;
    private String cpf;
    private String name;
    private Account account;
}

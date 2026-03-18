package com.devsuperior.crud_produtos.dto.errors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ProductError {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;
}

package com.devsuperior.crud_produtos.dto;

import com.devsuperior.crud_produtos.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDTO {

    private Long id;

    @Size(min = 3, max = 80, message = "O nome do produto deve ter entre 3 e 80 caracteres!")
    @NotBlank(message = "O nome do produto não pode ser vazio!")
    private String name;
    private String description;

    @NotNull
    @Positive(message = "O preço do produto deve ser maior que zero!")
    private Double price;

    @NotNull
    @Positive(message = "A quantidade do produto deve ser maior que zero!")
    private Integer stock;

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        stock = entity.getStock();
    }
}

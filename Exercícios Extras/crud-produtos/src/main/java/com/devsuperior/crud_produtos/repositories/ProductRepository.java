package com.devsuperior.crud_produtos.repositories;

import com.devsuperior.crud_produtos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.devsuperior.crud_produtos.service;

import com.devsuperior.crud_produtos.dto.ProductDTO;
import com.devsuperior.crud_produtos.entities.Product;
import com.devsuperior.crud_produtos.repositories.ProductRepository;
import com.devsuperior.crud_produtos.service.exceptions.DatabaseException;
import com.devsuperior.crud_produtos.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAllPaged(Pageable pageable) {
        return productRepository.findAll(pageable).map(ProductDTO::new);
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        return new ProductDTO(productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado!")));
    }

    @Transactional
    public ProductDTO insert(ProductDTO productDTO) {
        Product entity = new Product();
        return new ProductDTO(productRepository.save(entity));
    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO productDTO) {
        try {
            Product entity = productRepository.getReferenceById(id);
            entity.setName(productDTO.getName());
            entity.setDescription(productDTO.getDescription());
            entity.setPrice(productDTO.getPrice());
            entity.setStock(productDTO.getStock());
            return new ProductDTO(productRepository.save(entity));
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Não encontrado o produto ao tentar atualizar!");
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ResourceNotFoundException("Não encontrado o produto ao tentar deletar!");
        }
        try {
            productRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Falha ao tentar deletar o produto!");
        }
    }
}

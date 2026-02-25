package com.devsuperior.lojavirtual.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momento;
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}

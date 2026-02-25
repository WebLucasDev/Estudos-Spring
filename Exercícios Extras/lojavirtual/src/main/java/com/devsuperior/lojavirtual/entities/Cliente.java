package com.devsuperior.lojavirtual.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos;
}

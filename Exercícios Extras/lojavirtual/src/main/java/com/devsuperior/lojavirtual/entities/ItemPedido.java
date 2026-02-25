package com.devsuperior.lojavirtual.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {

    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private Integer quantidade;
    private Double precoUnitario;
}
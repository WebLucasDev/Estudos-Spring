package com.devsuperior.lojavirtual.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {

    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private Integer quantidade;
    private Double precoUnitario;

    public ItemPedido(){
    }

    public ItemPedido(ItemPedidoPK id, Integer quantidade, Double precoUnitario) {
        this.id = id;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public ItemPedidoPK getId() {
        return id;
    }

    public void setId(ItemPedidoPK id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        ItemPedido that = (ItemPedido) o;
        return Objects.equals(id, that.id) && Objects.equals(quantidade, that.quantidade) && Objects.equals(precoUnitario, that.precoUnitario);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(quantidade);
        result = 31 * result + Objects.hashCode(precoUnitario);
        return result;
    }
}
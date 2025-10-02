package com.itb.inf2dm.pizzariad.model.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(nullable = false)
    private int quantidadeitem;


    private boolean codStatus;

    @Column(nullable = false, columnDefinition = "DECIMAL(5,2)")
    private double valorUnitario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidadeitem() {
        return quantidadeitem;
    }

    public void setQuantidadeitem(int quantidadeitem) {
        this.quantidadeitem = quantidadeitem;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}

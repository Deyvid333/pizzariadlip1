package com.itb.inf2dm.pizzariad.model.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, columnDefinition = "DECIMAL(5,2)")
    private double valor;

@Column(nullable = false)
    private int dataHoraPedido;

@Column(nullable = true)
    private int dataHoraEntrega;

@Column(length = 20, nullable = false)
    private boolean Status;

    @Column(columnDefinition ="decimal(5, 2)", nullable = false)
    private double valorPedido;

    private boolean codStatus;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public int getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public void setDataHoraEntrega(int dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public int getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(int dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }


    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}


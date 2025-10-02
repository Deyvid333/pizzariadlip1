package com.itb.inf2dm.pizzariad.model.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Telefone")
public class Telefone {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  boolean id;

    @Column(length = 5, nullable = false)
    private short ddd;

    @Column(length = 15, nullable = false)
    private String numero;


    private boolean codStatus;


    public boolean isId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public short getDdd() {
        return ddd;
    }

    public void setDdd(short ddd) {
        this.ddd = ddd;
    }
}

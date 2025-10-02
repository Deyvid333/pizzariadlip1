package com.itb.inf2dm.pizzariad.model.entity;

import jakarta.persistence.*;


@Entity
@Table (name = "usuarío")
public class Usuario {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = true)
    private String nome;

    @Column(length = 45, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String senha;

    @Column(length = 20, nullable = false)
    private String sexo;

    @Column(length = 10, nullable = true)
    private String cep;

    @Column(length = 45, nullable = true)
    private String cidade;

    @Column(length = 15, nullable = true)
    private String cpf;


    @Column(length = 2, nullable = true)
    private short uf;

    @Column(length = 45, nullable = true)
    private String bairro;

    @Column(length = 45, nullable = true)
    private String logradouro;

    @Column(length = 45, nullable = false)
    private String tipousuario;


    private boolean codStatus;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public short getUf() {
        return uf;
    }

    public void setUf(short uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String gettipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }


}

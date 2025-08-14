package com.itb.inf2dm.pizzariad.controller;


import model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/produto")

public class ProdutoController {

    List<Produto> produtos = new ArrayList<Produto>();

    @GetMapping
    public List<Produto> findAll(){

        Produto p1 = new Produto();
        p1.setNome("pizza de calabresa");
        p1.setDescricao("pizza de calabresa com muita cebola");
        p1.setValorVenda(49.90);

        Produto p2 = new Produto();
        p2.setNome("pizza de frango com catupri");
        p2.setDescricao("pizza de frango com catupri e borda recheada com uma coca zero de brinde");
        p2.setValorVenda(78.90);


        produtos.add(p1);
        produtos.add(p2);
        return produtos;
    }






}

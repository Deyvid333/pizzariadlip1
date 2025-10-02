package com.itb.inf2dm.pizzariad.controller;

import com.itb.inf2dm.pizzariad.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/api/v1/Categoria")

public class CategoriaControler {
        List<Categoria> Categoria = new ArrayList<Categoria>();

        @GetMapping
        public List<Categoria> findAll() {

            Categoria c1 = new Categoria();
            c1.setNome("tamanho");
            c1.setDescricao("a pizza pode ser grande pequena ou media");


            Categoria c2 = new Categoria();
            c2.setNome("sabor");
            c2.setDescricao("a pizza pode variar entre doce ou salgado");

            Categoria c3 = new Categoria();
            c3.setNome("borda");
            c3.setDescricao("se a pizza é ou não recheada");



            Categoria.add(c1);
            Categoria.add(c2);
            Categoria.add(c3);
            return Categoria;
        }
}


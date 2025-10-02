package com.itb.inf2dm.pizzariad.controller;

import com.itb.inf2dm.pizzariad.model.services.ProdutoServices;
import com.itb.inf2dm.pizzariad.model.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/produto")
@ResponseBody

public class ProdutoController {


    @Autowired
    private ProdutoServices produtoServices;

    @GetMapping
    public ResponseEntity<List<Produto>> ListarTodosProdutos(@PathVariable) {
        return ResponseEntity.ok(produtoServices.findAll());
    }

    @PostMapping
    public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto) {
        Produto novoProduto = produtoServices.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> listarProdutoPorId(@PathVariable String id) {
        try {
            return ResponseEntity.ok(produtoservice.findById(Long.parseLong(id)));
        }
        catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "Bad Request",
                            "message", "O id informado não é válido: " + id
                    )
            );
        }
        catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Produto não encontrado com o id: " + id
                    )
            );
        }


    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> atualizarproduto(@PathVariable String id, @RequestBody Produto produto) {
        try {
            return ResponseEntity.ok(produtoservice.findById(Long.parseLong(id)));
        }
        catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "Bad Request",
                            "message", "O id informado não é válido: " + id
                    )
            );
        }
        catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Produto não encontrado com o id: " + id
                    )
            );
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> deletarprodutoPorid(@PathVariable String id) {
        try {
            return ResponseEntity.ok(produtoservice.findById(Long.parseLong(id)));
        }
        catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 200,

                            "message", "Produto deletado com sucesso"
                    )
            );
        }
        catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Produto não encontrado com o id: " + id
                    )
            );
        }


    }
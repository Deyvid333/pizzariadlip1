package com.itb.inf2dm.pizzariad.model.services;


import com.itb.inf2dm.pizzariad.model.repository.ProdutoRepository;
import com.itb.inf2dm.pizzariad.model.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Autowired: injeção de dependencia ou seja a restrida classe exige o objeto declarado abaixo
@Service
public class ProdutoServices {

    @Autowired
    private ProdutoRepository produtoRepository;

    //listar todos os produtos

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    //savar produtos

    public Produto save(Produto produto) {
        produto.setCodStatus(true);
        return produtoRepository.save(produto);
    }

    //listar produto por id
    public Produto findById(Long id) {
        return produtoRepository.findById(id)
                .orElsethrow(()-> new  RuntimeException("Produto não encontrado com o id: " + id);
    }

    //atualizar produto

    public Produto update(Produto produto, Long id) {

        Produto ProdutoExistente = findById(id);
        ProdutoExistente.setNome(produto.getNome());
        ProdutoExistente.setDescricao(produto.getDescricao());
        ProdutoExistente.setTipo(produto.getTipo());
        ProdutoExistente.setValorVenda(produto.getValorVenda());
        ProdutoExistente.setValorCompra(produto.getValorCompra());
        ProdutoExistente.setQuantidadeEstoque(produto.getQuantidadeEstoque());


        return produtoRepository.save(produto);
    }

    // excluir produto (exclusão fisica)

    public void delete(Long id) {
        Produto ProdutoExistente = findById(id);
        produtoRepository.delete(ProdutoExistente);
    }


}

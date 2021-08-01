package br.com.fpsaraiva.projetosb.controllers;

import br.com.fpsaraiva.projetosb.models.entities.Produto;
import br.com.fpsaraiva.projetosb.models.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody
    Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path="/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

    @PutMapping
    public Produto atualizarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
}

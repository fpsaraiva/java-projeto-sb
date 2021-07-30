package br.com.fpsaraiva.projetosb.controllers;

import br.com.fpsaraiva.projetosb.models.entities.Produto;
import br.com.fpsaraiva.projetosb.models.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody
    Produto novoProduto(Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
}

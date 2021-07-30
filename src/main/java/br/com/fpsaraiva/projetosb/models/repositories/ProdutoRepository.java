package br.com.fpsaraiva.projetosb.models.repositories;

import br.com.fpsaraiva.projetosb.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}

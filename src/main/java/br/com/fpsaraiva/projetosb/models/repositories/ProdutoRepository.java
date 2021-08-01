package br.com.fpsaraiva.projetosb.models.repositories;

import br.com.fpsaraiva.projetosb.models.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
}

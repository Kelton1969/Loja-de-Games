// ProdutoRepository.java
package com.loja.repository;

import com.loja.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
    List<Produtos> findAllByNomeContainingIgnoreCase(String nome);
}

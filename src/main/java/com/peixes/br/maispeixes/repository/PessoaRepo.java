package com.peixes.br.maispeixes.repository;

import com.peixes.br.maispeixes.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepo extends JpaRepository<Pessoa, Integer> {
}

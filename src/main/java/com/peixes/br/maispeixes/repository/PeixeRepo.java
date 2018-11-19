package com.peixes.br.maispeixes.repository;

import com.peixes.br.maispeixes.model.Peixe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeixeRepo extends JpaRepository<Peixe, Integer> {
}

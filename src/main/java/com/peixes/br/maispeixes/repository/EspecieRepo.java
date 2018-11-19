package com.peixes.br.maispeixes.repository;

import com.peixes.br.maispeixes.model.Especie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecieRepo extends JpaRepository<Especie, Integer> {
}
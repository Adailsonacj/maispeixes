package com.peixes.br.maispeixes.repository;

import com.peixes.br.maispeixes.model.Viveiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TanqueRepo extends JpaRepository<Viveiro, Integer> {
}

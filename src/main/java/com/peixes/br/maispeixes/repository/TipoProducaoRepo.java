package com.peixes.br.maispeixes.repository;

import com.peixes.br.maispeixes.model.TipoViveiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProducaoRepo extends JpaRepository<TipoViveiro, Integer> {
}

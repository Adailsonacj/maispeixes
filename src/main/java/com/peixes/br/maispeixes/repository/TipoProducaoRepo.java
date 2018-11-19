package com.peixes.br.maispeixes.repository;

import com.peixes.br.maispeixes.model.Biometria;
import com.peixes.br.maispeixes.model.TipoProducao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProducaoRepo extends JpaRepository<TipoProducao, Integer> {
}

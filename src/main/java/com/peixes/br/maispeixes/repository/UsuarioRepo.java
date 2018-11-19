package com.peixes.br.maispeixes.repository;

import com.peixes.br.maispeixes.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {
}

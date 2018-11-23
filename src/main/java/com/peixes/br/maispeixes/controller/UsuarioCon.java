package com.peixes.br.maispeixes.controller;

import com.peixes.br.maispeixes.model.Usuario;
import com.peixes.br.maispeixes.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/usuario")
public class UsuarioCon {
    @Autowired
    private UsuarioRepo usuarioRepo;

    @GetMapping("/all")
    public List<Usuario> getAll() {
        return usuarioRepo.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody String insertUser (@RequestParam String email ,
                                            @RequestParam String senha, @RequestParam int idPessoa) {
        Usuario n = new Usuario(email, senha, idPessoa);
        usuarioRepo.save(n);
        return "Saved: id = " +n.getId();
    }
}

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

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String insertUser (@RequestParam String nome , @RequestParam String autor) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        //Livro n = new Livro(nome, autor);
        //livroRepository.save(n);
        return "Saved";
    }
}

package com.peixes.br.maispeixes.controller;

import com.peixes.br.maispeixes.model.Pessoa;
import com.peixes.br.maispeixes.repository.PessoaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/pessoa")
public class PessoaCon {
    @Autowired
    private PessoaRepo pessoaRepo;

    @GetMapping("/all")
    public List<Pessoa> getAll() {
        return pessoaRepo.findAll();
    }

    @PostMapping(path = "/add")
    public @ResponseBody
    String insertUser(@RequestParam String nome, @RequestParam String cpf) {
        Pessoa n = new Pessoa(nome, cpf);
        pessoaRepo.save(n);
        return "Saved";
    }

    @DeleteMapping("/delete")
    public @ResponseBody String deletePessoa (@RequestParam int id){
        pessoaRepo.deleteById(id);
        return "Deletado" + id;
    }
}

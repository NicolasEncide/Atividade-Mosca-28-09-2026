package com.ninjas.ninjas.controller;

import com.ninjas.ninjas.model.Cla;
import com.ninjas.ninjas.service.ClaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clas")
public class ClaController {

    @Autowired
    private ClaService claService;

    @PostMapping
    public Cla cadastrarCla(@Valid @RequestBody Cla cla){
        return claService.cadastrarCla(cla);
    }

    @GetMapping
    public List<Cla> listarClas(){
        return claService.listarClas();
    }

    @GetMapping("/id/{id}")
    public Optional<Cla> pesquisarCla(@PathVariable Long id){
        return claService.pesquisarClaPorId(id);
    }

    @GetMapping("/nome/{nome}")
    public List<Cla> pesquisarClasPorNome(@PathVariable String nome){
        return claService.pesquisarClasPorNome(nome);
    }

    @GetMapping("/descricao/{descricao}")
    public List<Cla> pesquisarClasPorDescricao(@PathVariable String descricao){
        return claService.pesquisarClasPorDescricao(descricao);
    }

    @PutMapping("/{id}")
    public Cla atualizarCla(@PathVariable Long id, @Valid @RequestBody Cla cla){
        return claService.atualizarCla(id, cla);
    }

    @DeleteMapping("/{id}")
    public void deletarCla(@PathVariable Long id){
        claService.deletarCla(id);
    }
}

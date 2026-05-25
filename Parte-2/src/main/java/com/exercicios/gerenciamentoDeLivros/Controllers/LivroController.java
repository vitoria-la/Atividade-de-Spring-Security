package com.exercicios.gerenciamentoDeLivros.Controllers;


import com.exercicios.gerenciamentoDeLivros.Modells.LivroModel;
import com.exercicios.gerenciamentoDeLivros.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping
    public ResponseEntity<LivroModel> criarLivro(@RequestBody LivroModel livroModel) {
        LivroModel request = livroService.criarLivro(livroModel);
        return ResponseEntity.status(201).body(request);
    }

    @GetMapping
    public ResponseEntity<List<LivroModel>> listarLivros() {
        List<LivroModel> request = livroService.listarLivros();
        return ResponseEntity.status(200).body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<LivroModel>> buscarLivro(@PathVariable Long id) {
        Optional<LivroModel> request = livroService.buscarLivro(id);
        return ResponseEntity.status(200).body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarLivro(@PathVariable Long id) {
        livroService.deletarLivro(id);
        return ResponseEntity.status(204).build();
    }
}

package com.exercicios.gerenciamentoDeLivros.Controllers;


import com.exercicios.gerenciamentoDeLivros.Modells.LivroModel;
import com.exercicios.gerenciamentoDeLivros.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// @RestController significa que essa classe será um controller do tipo REST
@RestController
// @RequestMapping(path = "/livros") é onde coloca qual será o caminho para acessar esse controller
@RequestMapping(path = "/livros")
public class LivroController {

    // @Autowired realiza a injeção de dependências
    @Autowired
    LivroService livroService;

    // @PostMapping significa que a requisição a seguir é um POST
    @PostMapping
    // @RequestBody mostra que o LivroModel virá por meio do corpo da requisição
    public ResponseEntity<LivroModel> criarLivro(@RequestBody LivroModel livroModel) {
        LivroModel request = livroService.criarLivro(livroModel);
        return ResponseEntity.status(201).body(request);
    }

    // @GetMapping significa que a requisição a seguir é um GET
    @GetMapping
    public ResponseEntity<List<LivroModel>> listarLivros() {
        List<LivroModel> request = livroService.listarLivros();
        return ResponseEntity.status(200).body(request);
    }

    // @GetMapping("/{id}") significa que a requisição a seguir é um GET, onde o conteúdo pós / no caminho será um ID
    @GetMapping("/{id}")
    // @PathVariable mostra que a variável id virá por meio do caminho, como indicado na anotação ("/{id}")
    public ResponseEntity<Optional<LivroModel>> buscarLivro(@PathVariable Long id) {
        Optional<LivroModel> request = livroService.buscarLivro(id);
        return ResponseEntity.status(200).body(request);
    }

    // @DeleteMapping("/{id}") significa que a requisição a seguir é um DELETE, onde o conteúdo pós / no caminho será um ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarLivro(@PathVariable Long id) {
        livroService.deletarLivro(id);
        return ResponseEntity.status(204).build();
    }
}

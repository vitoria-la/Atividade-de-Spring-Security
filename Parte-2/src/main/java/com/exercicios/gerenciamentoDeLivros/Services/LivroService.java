package com.exercicios.gerenciamentoDeLivros.Services;

import com.exercicios.gerenciamentoDeLivros.Modells.LivroModel;
import com.exercicios.gerenciamentoDeLivros.Repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Service mostra que essa classe irá atuar como um Service
@Service
public class LivroService {

    // @Autowired realiza a injeção de dependências
    @Autowired
    LivroRepository livroRepository;

    public LivroModel criarLivro(LivroModel livroModel) {
        return livroRepository.save(livroModel);
    }

    public List<LivroModel> listarLivros() {
        return livroRepository.findAll();
    }

    public Optional<LivroModel> buscarLivro(Long id) {
        return livroRepository.findById(id);
    }

    public void deletarLivro(Long id) {
        livroRepository.deleteById(id);
    }


}

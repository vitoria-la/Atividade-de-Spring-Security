package com.exercicios.gerenciamentoDeLivros.Repositories;

import com.exercicios.gerenciamentoDeLivros.Modells.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {
}

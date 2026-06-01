package com.exercicios.gerenciamentoDeLivros.Modells;

import jakarta.persistence.*;

// @Entity Serve para criar uma entidade no banco, nesse caso de um livro
@Entity
// @Table dá um nome para a tabela no banco referente a essa entidade
@Table(name = "tb_livro")
public class LivroModel {

    // Torna uma variável em ID
    @Id
    // Vai gerar um valor para o campo de ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    // @Column nomeia uma coluna no banco de dados
    @Column(name = "Autor")
    private String autor;
    @Column(name = "Ano_de_publicacao")
    private Integer anoPublicacao;

    public LivroModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}

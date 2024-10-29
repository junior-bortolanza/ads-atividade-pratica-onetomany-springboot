package com.descomplica.atividade.pratica.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tb_instrutor")
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private Long rg;
    private String nome;
    private Date dataNascimento;
    private Long titulacao;

    @OneToMany(mappedBy = "tb_instrutor")
    private Set<Turma> turma;

    public Instrutor(){

    }

    public Instrutor(Long id, Long rg, String nome, Date dataNascimento, Long titulacao) {
        this.id = id;
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.titulacao = titulacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Long titulacao) {
        this.titulacao = titulacao;
    }
}

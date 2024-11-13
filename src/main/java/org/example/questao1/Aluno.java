package org.example.questao1;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int id;
    private String nome;
    private List<Curso> cursos;

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void adicionar_curso(Curso curso) {
        this.cursos.add(curso);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return this.cursos;
    }
}

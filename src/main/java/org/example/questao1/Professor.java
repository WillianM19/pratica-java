package org.example.questao1;

public class Professor {
    private int id;
    private String nome;
    private Curso[] cursos;

    public void adicionar_curso(String nome) {
        int id = this.cursos.length;

        novo_curso = new Curso(id, nome);
    }
}

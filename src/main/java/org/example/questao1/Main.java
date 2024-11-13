package org.example.questao1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

//      Questão 1
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();

        Curso cursoADS = new Curso(0, "ADS", 2060);

//      Testando professor
        Professor professor1 = new Professor(0, "Professor1");
        associar_professor_a_curso(professor1, cursoADS);

        exibir_cursos_do_professor(professor1);

//      Testando Aluno
        Aluno aluno1 = new Aluno(0, "aluno1");
        matricular_aluno(cursoADS, aluno1);

        Aluno aluno2 = new Aluno(0, "aluno2");
        matricular_aluno(cursoADS, aluno2);

        Aluno aluno3= new Aluno(0, "aluno3");

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        exibir_alunos_do_curso(alunos, cursoADS);

    }

    public static void matricular_aluno(Curso curso, Aluno aluno) {
        aluno.adicionar_curso(curso);
    }

    public static void associar_professor_a_curso(Professor professor, Curso curso) {
        professor.adicionar_curso(curso);
    }

    public static void exibir_alunos_do_curso(List<Aluno> alunos, Curso curso) {
        System.out.println("Alunos do curso " + curso.getNome() + ":");
        for (Aluno aluno : alunos) {
            List<Curso> cursos = aluno.getCursos();

            for (Curso cursoCheck : cursos) {
                if (curso == cursoCheck) {
                    System.out.println("- " + aluno.getNome());
                }
            }
        }
    }

    public static void exibir_cursos_do_professor(Professor professor) {
        List<Curso> cursos = professor.getCursos();

        for (Curso curso : cursos) {
            System.out.println("Cursos do professor " + professor.getNome() + ":");
            System.out.println("- " + curso.getNome());
        }
    }
}
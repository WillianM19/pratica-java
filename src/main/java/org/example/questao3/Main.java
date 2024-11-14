package org.example.questao3;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("Titulo do livro", "Autor do livro", 2024);

        Revista revista = new Revista("Titulo da revista", "Autor do livro", 2024);

        Biblioteca<Publicacao> biblioteca = new Biblioteca();
        biblioteca.adicionarPublicacao(livro);
        biblioteca.adicionarPublicacao(revista);

        biblioteca.listarPublicacoes();
    }
}

package org.example.questao3;

public class Livro extends Publicacao {

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String resumo() {
        return "Livro: " + this.titulo + " " + this.autor;
    }
}

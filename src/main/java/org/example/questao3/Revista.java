package org.example.questao3;

public class Revista extends Publicacao{

    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String resumo() {
        return "revista: " + this.titulo + " " + this.anoPublicacao;
    }
}

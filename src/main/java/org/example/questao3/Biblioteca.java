package org.example.questao3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Publicacao> {
    List<T> publicacoes;

    public Biblioteca() {
        this.publicacoes = new ArrayList<>();
    }

    public void listarPublicacoes() {
        for (T publicacao : publicacoes) {
            System.out.println(publicacao.resumo());
        }
    }

    public void adicionarPublicacao(T publicacao) {
        this.publicacoes.add(publicacao);
    }

    public void removerPublicacao(T publicacao) {
        this.publicacoes.remove(publicacao);
    }
}

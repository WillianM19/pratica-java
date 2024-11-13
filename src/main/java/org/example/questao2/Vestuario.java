package org.example.questao2;

public class Vestuario extends Produto {

    public Vestuario(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    double calcularDesconto() {
        return this.preco - (this.preco * 0.2);
    }
}

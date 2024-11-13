package org.example.questao2;

public class Eletronico extends Produto{

    public Eletronico(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    double calcularDesconto() {
        return this.preco - (this.preco * 0.1);
    }
}

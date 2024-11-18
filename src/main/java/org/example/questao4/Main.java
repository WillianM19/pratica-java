package org.example.questao4;

public class Main {
    public static void main(String[] args){
        Conta contaCorrenteJose = new ContaCorrente("3829348dm", "José", 999);
        Conta contaPoupancaMaria = new ContaPoupanca("3829348dm", "José", 999);
        Transacao transacao = new Transacao();

        try {
            transacao.depositar(10, contaCorrenteJose);
            transacao.depositar(10, contaPoupancaMaria);

            transacao.sacar(20, contaCorrenteJose);
            transacao.depositar(10, contaPoupancaMaria);
        } finally {
            System.out.println("Processo finalizado");
        }
    }
}

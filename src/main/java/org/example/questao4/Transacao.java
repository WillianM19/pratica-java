package org.example.questao4;

public class Transacao {

    public void sacar(double valor, Conta conta){
        if (valor < conta.getSaldo() && valor > 0) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque realizado");
        } else {
            System.out.println("Não há limite ou valor inválido");
        }
    }

    public void depositar(double valor, Conta conta){
        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Valor invalido");
        }
    }
}

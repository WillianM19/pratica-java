package org.example.questao2;

public class Main {
    public static void main(String[] args){
        Eletronico smartphone = new Eletronico(0, "Xiaomi", 1000);
        Vestuario camisa = new Vestuario(0, "camisa azul", 50);

        PagamentoCartao pagamentoComCartao = new PagamentoCartao();

        PagamentoPix pagamentoComPix = new PagamentoPix();

        System.out.println("Pagando produto: " + smartphone.getNome());
        pagamentoComPix.processarPagamento();
        System.out.println("Pagando produto: " + camisa.getNome());
        pagamentoComCartao.processarPagamento();
    }
}

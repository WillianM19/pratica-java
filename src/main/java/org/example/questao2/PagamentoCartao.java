package org.example.questao2;

public class PagamentoCartao implements Pagamento{

    @Override
    public boolean processarPagamento() {
        System.out.println("Pagamento o produto no cartão realizado com sucesso!");
        return true;
    }
}

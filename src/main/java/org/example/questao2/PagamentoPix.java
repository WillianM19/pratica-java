package org.example.questao2;

public class PagamentoPix implements Pagamento {

    @Override
    public boolean processarPagamento() {
        System.out.println("Pagamento no pix realizado com sucesso!");
        return true;
    }
}

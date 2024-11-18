package org.example.questao5;

public class Main {
    public static void main(String[] args) {
        Empresa<Funcionario> empresa = new Empresa<>();

        Gerente gerente = new Gerente(1, "Carlos Silva", 8000.00);
        Analista analista1 = new Analista(2, "Ana Costa", 5000.00);
        Analista analista2 = new Analista(3, "Pedro Santos", 6000.00);

        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(analista1);
        empresa.adicionarFuncionario(analista2);
        
        empresa.listarFuncionarios();
    }
}

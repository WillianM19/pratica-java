package org.example.questao5;

import java.util.ArrayList;
import java.util.List;

class Empresa<T extends Funcionario> {
    private List<T> funcionarios = new ArrayList<T>();

    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(T funcionario) {
        funcionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários na empresa:");
        for (T funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
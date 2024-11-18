package org.example.questao5;

abstract class Funcionario {
    int id;
    String nome;
    double salarioBase;

    public Funcionario(int id, String nome, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }
}

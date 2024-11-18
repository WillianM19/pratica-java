package org.example.questao5;

class Analista extends Funcionario implements Bonus {
    public Analista(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * (percentual / 100);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(5);
    }

    @Override
    public String toString() {
        return this.nome + ", Salário Final (com Bônus): " + calcularSalario();
    }
}
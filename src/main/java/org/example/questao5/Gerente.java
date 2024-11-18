package org.example.questao5;

class Gerente extends Funcionario implements Bonus {
    public Gerente(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * (percentual / 100);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(10);
    }

    @Override
    public String toString() {
        return this.nome + ", Salário Final (com Bônus): " + calcularSalario();
    }
}
package com.heranca.poo;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double limite) {
        super(nomeCliente, numConta);
        this.limite = limite;
    }

    public double sacar(double saque, double limite) {
        double saldoAtual =0;
        double limiteConta = getSaldo() + limite;
        if (saque <= limiteConta) {
            limiteConta -= saque;
            saldoAtual = limiteConta - saque;

        }else {
            System.out.println("Limite ultrapassado!");
        }
        return saldoAtual;
    }

    @Override
    public String toString() {
        return "\nNome cliente: " + getNomeCliente() +
                "\nNúmero da conta: " + getNumConta();
    }
}

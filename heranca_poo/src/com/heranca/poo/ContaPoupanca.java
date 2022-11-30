package com.heranca.poo;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, int diaRendimento) {
        super(nomeCliente, numConta);
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSalvo(double taxa){
        double redimento = getSaldo() * taxa/ 100;
        double saldo = getSaldo() + redimento;
        setSaldo(saldo);
        return saldo;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "\nNome cliente: " + getNomeCliente() +
        "\nNúmero da conta: " + getNumConta() +
        "\nDia do rendimento: " + getDiaRendimento();

    }
}

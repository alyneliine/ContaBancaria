package com.heranca.poo;

public abstract class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo;


    public ContaBancaria(String nomeCliente, int numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = 0;
    }

    public double sacar(double saque){
        if(saldo > saque){
            this.saldo -= saque;
        }
        else{
            System.out.println("Saldo indíponivel!");
        }
        return saldo;
    }

    public void depositar(double deposito){
        this.saldo += deposito;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


package com.heranca.poo;
import java.util.ArrayList;
import java.util.List;

public class AppConta {
    public static void main(String[] args){

        List<ContaPoupanca> contaPoupancas = new ArrayList<ContaPoupanca>();
        List<ContaEspecial> contaEspecias = new ArrayList<ContaEspecial>();


        contaPoupancas.add(new ContaPoupanca("Aline", 12, 15));
        contaEspecias.add(new ContaEspecial("Gabriel", 13, 200));

        for(ContaPoupanca contaPoupanca : contaPoupancas){
            contaPoupanca.sacar(200);
            contaPoupanca.depositar(400);
            contaPoupanca.calcularNovoSalvo(10);
            contaPoupanca.sacar(200);
            System.out.println("Saldo novo é: " + contaPoupanca.getSaldo());
            System.out.println(contaPoupanca.toString());

        }
        System.out.println();

        for(ContaEspecial contaEspecial : contaEspecias){
            contaEspecial.sacar(100);
            contaEspecial.depositar(500);
            contaEspecial.sacar(100);
            System.out.println("Saldo novo é: " + contaEspecial.getSaldo());
            System.out.println(contaEspecial.toString());

        }

    }
}

package atividade_1;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class ContaCorrente extends Conta{


    public ContaCorrente(int numeroDaConta, int AgenciaDoCliente, String nCliente) {
        super(numeroDaConta, AgenciaDoCliente, nCliente);
    }

    @Override
    public double sacar(double i) {
        if((i + 0.10) <= this.saldo) {
            this.saldo = this.saldo - (0.10 + i);
            System.out.println("Você acabou de sacar R$" + i);
        }
        else {
            System.out.println("Impossível sacar!");
        }
        return this.saldo;
    }

    @Override
    public double depositar(double i) {
        System.out.println("Você acabou de depositar R$" + i);
        this.saldo = this.saldo + i;
        return this.saldo;
    }

    @Override
    public void mostrar() {
        System.out.println("Titular da conta: " + this.cliente);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo da conta: " + this.saldo);
    }


}

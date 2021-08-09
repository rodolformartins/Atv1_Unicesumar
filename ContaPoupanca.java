package atividade_1;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroDaConta, int AgenciaDoCliente, String nCliente) {
        super(numeroDaConta, AgenciaDoCliente, nCliente);
    }

    @Override
    public double depositar(double i) {
        System.out.println("------------------------------");
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
        System.out.print("--------------------------------");
    }

    @Override
    public double sacar(double i) {
        if(i <= this.saldo){
            this.saldo = this.saldo - i;
            System.out.println("você acabou de sacar R$" + i);
        }
        else {
            System.out.println("Impossível sacar!");
        }
        return this.saldo;
    }
}

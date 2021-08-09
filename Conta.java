package atividade_1;

public abstract class Conta {
    //Atributos dessa classe
    protected int numero;
    protected int agencia;
    protected String cliente;
    protected double saldo;

    //Método construtor
    public Conta(int numeroDaConta, int AgenciaDoCliente, String nCliente){
        numero = numeroDaConta;
        agencia = AgenciaDoCliente;
        cliente = nCliente;
        saldo = 0d;
    }


    //Métodos getters and Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo(){
        return saldo;
    }


    public abstract double sacar(double i);

    public double depositar(double i){
        this.saldo = this.saldo + i;
        return this.saldo;
    }

    public abstract void mostrar();
}
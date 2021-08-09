package atividade_1;

public class Principal {
    public static void main(String[] args) {

    Cliente rodolfo = new Cliente("Rodolfo", "12533355599-97");
    Cliente Ana = new Cliente("Ana", "23254888666-95");

    ContaCorrente c1 = new ContaCorrente(123, 2244, rodolfo.getNome());
    c1.depositar(500.00d);
    c1.sacar(250d);
    c1.mostrar();

    ContaPoupanca c2 = new ContaPoupanca(124, 2245, Ana.getNome());
    c2.depositar(574.50d);
    c2.sacar(300d);
    c2.mostrar();
    }
}


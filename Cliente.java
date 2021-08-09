package atividade_1;

public class Cliente {
    //Atributos
    private String nome;
    private String cpf;

    //Construtor da classe
    public Cliente(String n, String c){
        nome = n;
        cpf  = c;
    }

    //Getters and setters da classe Cliente
    public String getNome() {
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void mostrar(){
        System.out.println("Nome do cliente: " + nome);
        System.out.println("CPF: " + cpf);
    }

}

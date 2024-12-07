/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrarcliente;

/**
 *
 * @author Sobral
 */
public class Cliente {
    
    private String nome;
    private int idade;
    private double saldo;
    
    public Cliente(){
        
    }

    public Cliente(String nome, int idade, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void descritivo(){
        System.out.println("-------------------------------");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Saldo: "+ this.getSaldo());
    }
    
}

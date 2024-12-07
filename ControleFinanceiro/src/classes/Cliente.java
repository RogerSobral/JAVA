/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Sobral
 */
public class Cliente {
    
    private String nome;
    private boolean status;
    private double saldo;
    private Contato contato;
    
    public Cliente (){
        
    }
    public Cliente (String nome){
        this.setNome(nome);
       
    }

     public Cliente ( double saldo){
        this.setSaldo(saldo);
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    
}

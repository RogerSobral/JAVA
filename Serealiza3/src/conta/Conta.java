/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author Sobral
 */
public class Conta implements java.io.Serializable{
   
   private String cliente;
   private double saldo;

   public Conta(){
       
   }
   public Conta( String cliente, double saldo){
       this.cliente=cliente;
       this.saldo=saldo;
   }
           
           
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String Cliente) {
        this.cliente = Cliente;
    }

    public double getSaldo() {
        return saldo;
    }

   public void deposito (double valor){
       this.saldo+= valor;
   }
   
   public void sacar(double valor){
       this.saldo-=valor;
   }
   
   public void demonstrativo (){
       System.out.println("-----------------Conta-------------------------");
       System.out.println("Nome: "+ this.getCliente());
       System.out.println("Saldo:" + this.getSaldo());
   }
   
   
}

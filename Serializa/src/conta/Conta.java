/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import exceptions.Excp_cpf;

/**
 *
 * @author Sobral
 */
public class Conta implements java.io.Serializable{
   
   private String cliente;
   private  double saldo;
   private String cpf;
   private String emial;

   public Conta(){
       
   }
   public Conta( String cliente, double saldo){
       this.cliente=cliente;
       this.saldo=saldo;
   }
           
    
    public Conta( String cliente, double saldo, String cpf){
       this.cliente=cliente;
       this.saldo=saldo;
       this.setCpf(cpf);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }
   
   public boolean testarCPF ( String cpf) throws Excp_cpf{
       
       boolean resposta= false;
       if (cpf.matches("\\d{2,}\\.\\d{3}\\.\\d{3}\\-\\d{2,}")){
           resposta= true;
       }else{
       throw new Excp_cpf("cpf esta digitado errado exp: 234.456.221-33");
       }
       return resposta;
   }
   
   
   
   
   public void demonstrativo (){
       System.out.println("-----------------Conta-------------------------");
       System.out.println("Nome: "+ this.getCliente());
       System.out.println("Saldo:" + this.getSaldo());
       System.out.println("Cpf:"+this.getCpf());
   }
   
   
}

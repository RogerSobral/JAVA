/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumteste;

/**
 *
 * @author Sobral
 */
public enum Operacao {
    DEPOSITAR("+"), SACAR("-"),INVESTIR("iv");
    
    
     private String movimento;
    Operacao(String movimento){
        this.movimento= movimento;
    }

    
    @Override
    public String toString() {
        return this.movimento;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }
    
   
  
}

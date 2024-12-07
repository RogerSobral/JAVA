/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumteste;

import static enumteste.Operacao.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Sobral
 */
public class EnumTeste {

    /**
     * @param args the command line arguments
     */
     public static  void movimentacaoBancaria(Operacao op,double n1, Cliente c1){
     
         switch(op.toString()){
             case "+":
              c1.setSaldo(c1.getSaldo()+n1); 
              break;
             case "-":
                 c1.setSaldo(c1.getSaldo()-n1);
                 break;
              
         }
    }
   
    
    public static void main(String[] args) {
       
        Cliente cliente=new Cliente();
        cliente.setNome("carlos");
        cliente.setSaldo(200);
        
      movimentacaoBancaria(DEPOSITAR, 155, cliente);
      
        System.out.println(cliente.getSaldo());
        
        
    }
    
}


package controlefinanceiro;

import classes.Cliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class ControleFinanceiro {

  
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        ArrayList <Cliente> c= new ArrayList<>();
        
        String resposta=null;
       try{
        do {
            System.out.println("Nome:");
         
            
            System.out.println("deseja continuar (sim ou nao)");
            resposta=teclado.next();
                
        }while(resposta.equalsIgnoreCase("sim")||resposta.equalsIgnoreCase("SIM"));
       }catch(Exception e){
           e.printStackTrace();
       }
        
        
    }
    
}

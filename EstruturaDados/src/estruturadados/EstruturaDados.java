/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sobral
 */
public class EstruturaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Vetor t= new Vetor(3);

        System.out.println(t.add("0"));
        System.out.println(t.add("1"));
        System.out.println(t.add("2"));
        System.out.println(t.add("3"));
        System.out.println(t.add("4"));
        System.out.println(t.add("5"));
        System.out.println(t.add("6"));
        System.out.println(t.add("7"));
        
        System.out.println(t);

        try {
          
            
            System.out.println("-------------------------");
            
            t.deletar("6");
            
            System.out.println(t);
        } catch (Exception ex) {
            Logger.getLogger(EstruturaDados.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    
    }
            
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classe.Vetor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sobral
 */
public class Exec6 {
  
    
    public static void main(String[] args) {
           Vetor v1= new Vetor(5);
        v1.add("b");
        v1.add("c");
        v1.add("d");
        
        System.out.println(v1);
        try {
            v1.add(0,"a");
        } catch (Exception ex) {
            Logger.getLogger(Exec6.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println(v1);

    }
}

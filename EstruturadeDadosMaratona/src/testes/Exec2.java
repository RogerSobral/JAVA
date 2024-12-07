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
public class Exec2 {
    
    public static void main(String[] args) {
        Vetor v1= new Vetor(3);
        v1.add("sobral");
        v1.add("marcos");
        v1.add("creuza");
        
        
        try {
            System.out.println("procura no 1 "+ v1.buscar(1));
        } catch (Exception ex) {
            Logger.getLogger(Exec2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

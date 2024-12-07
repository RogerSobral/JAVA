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
public class Exe8 {
    public static void main(String[] args) {
        Vetor v1= new Vetor(3);
        v1.add("1");
        v1.add("2");
        v1.add("3");
        v1.add("4");
        v1.add("5");
        v1.add("6");
        
        System.out.println(v1);
        
        try {
            v1.remove(1);
            System.out.println(v1);
        } catch (Exception ex) {
            Logger.getLogger(Exe8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}

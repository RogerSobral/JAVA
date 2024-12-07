/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classe.Vetor;

/**
 *
 * @author Sobral
 */
public class Execu1 {
    
    public static void main(String[] args) {
        
        Vetor v1= new Vetor(3);
        
        v1.add("sobral");
        v1.add("marcos");
        v1.add("creuza");
       // v1.add("creuza");
        
        
        System.out.println("tamanho "+v1.getTamanho());
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokkens;

/**
 *
 * @author Sobral
 */
public class Tokkens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase="sei que voce é homem";
        
        String palavras[]=frase.split(" ");
        
        for(String t:palavras){
          System.out.println(t);  
        }
        
    }
    
}

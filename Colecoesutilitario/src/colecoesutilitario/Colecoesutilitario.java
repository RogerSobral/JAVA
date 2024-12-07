/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoesutilitario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Sobral
 */
public class Colecoesutilitario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String []cor= {"Branco", "Azul", "Vermelho"};
        List<String> frutas= Arrays.asList(cor);
        
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Goiaba");
        frutas.add("Açai");
          
       
        
        
        
        
        Collections.sort(frutas);
        System.out.println(frutas);
        Set<String> cores= new HashSet<>(frutas);
        
      
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Sobral
 */
public class Collectionset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String[] cores= {"Amarelo","Vermelho", "Roxo", "Verde", "Amarelo","Verde"};
        List<String> lista= Arrays.asList(cores);
        
       
        
        System.out.println(lista);
        Set<String> set= new HashSet<>(lista);
        System.out.println(set);
        
    }
    
}

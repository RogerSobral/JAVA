/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author Sobral
 */
public class Colecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Collection <String> c= new ArrayList<>();
        c.add("A");
        c.add("B");
        c.add("C");
        System.out.println(c.toString());
        System.out.println(c.isEmpty());// verifica se sua coleção esta vazia
        System.out.println(c.contains("B"));// verifica se existe um determinado elemento dentro da coleção
        
        c.remove("C");// remove um determinando elemento 
        System.out.println(c.toString());
        
        
        // Trabalhando com Grupos de Elementos
        
        Collection<String> c2= Arrays.asList("D","E","F");
        c.addAll(c2);// addAll recebe uma nova coleção ao grupo
        
        System.out.println(c.toString());
        System.out.println(c.containsAll(c2));// verifica se existe dentro de uma coleção um outro grupo de coleção
//        c.removeAll(c2);// remove todos os elementos de uma coleção contidos em outra
        
        /* Percorrer os elementos  */
        for(String string: c){
            System.out.println(string);
        }
        // retornar um array atraves de uma coleção 
        
        String []s=c.toArray(new String[c.size()]);// convertendo uma coleção em um array de strings
        System.out.println(Arrays.toString(s));//mostrar os elementos do array string
        
        c.clear();// limpa a coleção 
        System.out.println(c.toString());
    }
    
}

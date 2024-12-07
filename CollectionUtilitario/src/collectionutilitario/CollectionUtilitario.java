/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionutilitario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.util.List;

/**
 *
 * @author Sobral
 */
public class CollectionUtilitario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<String> lista= new ArrayList<>();
        
        lista.add("Cenoura");
        lista.add("Abacate");
        lista.add("Maça");
        lista.add("Peira");
        lista.add("Goiaba");
        
        System.out.println(lista);
        Collections.sort(lista);// coloca em ordem alfabetica
        System.out.println(lista);
        
        Collections.reverse(lista);//inverte a ordem da lista
        System.out.println(lista);
        Collections.addAll(lista, "Morango", "Peira", "Tangerina");// add elementos a coleção 
        System.out.println(lista);
        Collections.shuffle(lista);// gera uma lista aliatoria dos elementos
        System.out.println(lista);
        
        List<String> lista2= new ArrayList<>();
        
        lista2.add("Morango");
        lista2.add("Graviola");
        
        System.out.println(Collections.disjoint(lista, lista2));//mostra um valor boolean se o elementos de uma lista esta contido na outra
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(Collections.binarySearch(lista, "Morango"));// mostra o indice de uma determinada palavra junto a coleção
        Collections.fill(lista,"açai");
        System.out.println(lista);
        
        //colleção que nao pode ser modificada
        
        Collection<String> Constante=Collections.unmodifiableCollection(lista);// deste modo essa coleção se tornou uma constante nao podendo ser modificada
        
        
        
    }
    
}

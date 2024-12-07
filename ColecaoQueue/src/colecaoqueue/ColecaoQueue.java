/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaoqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sobral
 */
public class ColecaoQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Queue<String> fila= new LinkedList<>();
        
        fila.add("Carlos");
        fila.add("Marcos");
        fila.add("Douglas");
        fila.add("Beto");
        fila.offer("Creuza");// ambos os metodos irao add elementos ao final da fila tanto o Offer como o add
        System.out.println(fila);
        System.out.println(fila.peek());// qual é o proximo elemento a ser chamado na fila
        System.out.println(fila.poll()); // remove o elemento que esta em primeiro lugar no caso o carlos
        // seria como se o carlos tive-se sido atendido e fosse chamado o proximo da fila
        
     System.out.println(fila.peek());// qual é o proximo elemento a ser chamado na fila
     
     /*  outros metodos disponiveis em LinkedList*/
     
     LinkedList<String> l=(LinkedList<String>) fila;
     
        System.out.println(l.peekFirst()); // retorna o primeiro da fila
        System.out.println(l.peekLast());// retorna o ultimo da fila
   // o metodo Poll tambem possui opções first e last
    }
    
}

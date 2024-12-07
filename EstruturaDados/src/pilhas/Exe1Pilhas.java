/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

/**
 *
 * @author Sobral
 */
public class Exe1Pilhas {
    
    public static void main(String[] args) {
        
        Pilha<Integer> pilha= new Pilha<>();
        for (int i = 0; i < 10; i++) {
            
        pilha.empilha(i);
        }
         
        System.out.println(pilha);
        System.out.println(pilha.tamanho);
    }
}

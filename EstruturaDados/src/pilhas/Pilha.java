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
public class Pilha <T> extends EstruturaEstatica<T> {
    
    public Pilha(int capacidade){
        super(capacidade);
    }
    
    public Pilha(){
        super();
    }
    
    
    public void empilha(T elemento){
        this.aumentarCapacidade();
        super.add(elemento);
    }
    
    
}

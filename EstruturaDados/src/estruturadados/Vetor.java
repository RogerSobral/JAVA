/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

import java.util.Arrays;

/**
 *
 * @author Sobral
 */
public class Vetor  <T>{
    
    T elementos[];
    int tamanho;
    
    
    public Vetor(int posicao){
        this.elementos= (T[])new Object[posicao];
        this.tamanho=0;
    }
    
    public Vetor(){
        this(10);
    }
    
    //addicionar
    public boolean add(T elemento){
        this.aumentarCapacidade();
       if(tamanho<this.elementos.length){
           this.elementos[tamanho]=elemento;
           this.tamanho++;
           return true;
       }
     
       return false;
    }
    
    //tamanho
    public int tamanho(){
        return this.tamanho;
    }

    //capiturar um elemento no vetor através do index
    public T buscar(int index){
        if(!(index>=0 && index<tamanho)){
            throw new IllegalArgumentException("Index fora do Array");
        }
            return this.elementos[index];
       
    }
    
    
    //verifica se o elemento existe no vetor
    public boolean buscar(T elemento){
        
        for (int i = 0; i < this.tamanho(); i++) {
            
            if(this.elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }
    
    //retorna o index
    public int buscar2(T elemento){
        
        for (int i = 0; i < this.tamanho(); i++) {
            
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    
    //  Add elemento em qualquer posição
    
    public boolean add2(int posicao, T elemento){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Index fora do Array");
        }
        this.aumentarCapacidade();
        
        for(int i=tamanho-1;i>=posicao;i--){
            this.elementos[i+1]=this.elementos[i];
        }
        this.elementos[posicao]=elemento;
        this.tamanho++;
        return true;
    }
    
    
    
    //Aumentar capacidade do vetor
   private void aumentarCapacidade(){
          if(this.tamanho==this.elementos.length){
              T elementosNovos[]=(T[]) new Object[this.elementos.length*2];
              
              for(int i=0;i<this.tamanho;i++){
                  elementosNovos[i]=this.elementos[i];
              }
              
              this.elementos=elementosNovos;
          }
   } 
    
   public boolean deletar(int index) throws Exception{
      if(!(index>=0&& index<tamanho)){
         throw new Exception("index não existe ");
      }
        for(int i=index;i<this.tamanho-1;i++){
            this.elementos[i]=this.elementos[i+1];
        }
      
        this.tamanho--;
        return true;
       
   }
   
   
    public boolean deletar(T elemento) throws Exception{
       
        
        if(!(this.buscar2(elemento)>=0&& this.buscar2(elemento)<tamanho)){
         throw new Exception("index não existe ");
      }
        for(int i=this.buscar2(elemento);i<this.tamanho-1;i++){
            this.elementos[i]=this.elementos[i+1];
        }
      
        this.tamanho--;
        return true;
       
   }
   
    @Override
    public String toString() {
        
        StringBuilder t= new StringBuilder("[");
        for (int i = 0; i < this.tamanho-1; i++) { 
           t.append(this.elementos[i]);
           t.append(",");
        }
           if(this.tamanho>0){
           t.append(this.elementos[this.tamanho-1]);
//               System.out.println("vendo valor "+this.elementos[this.tamanho-1]);
           }
        
        t.append("]");
        
        return t.toString();
        
        
        
    }
    
    
    
    
}

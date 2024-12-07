/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author Sobral
 */
public class Vetor {
    
    String elemento[];
    int tamanho;
    
    public Vetor(int tamanho){
      elemento= new String[tamanho];  
    this.tamanho=0;
      
    }
    
    //adicionar
    public boolean add(String elemento){
        this.aumentarCapacidade();
        if(tamanho<this.elemento.length){
        this.elemento[tamanho]=elemento;
        tamanho++;
        return true;
        }
        return false;
    }
    
    private void aumentarCapacidade(){
        if(this.tamanho==this.elemento.length){
            String elementosNovos[]= new String[this.elemento.length*2];
            
            for (int i = 0; i <this.elemento.length; i++) {
                elementosNovos[i]=this.elemento[i];
            }
            this.elemento=elementosNovos;
        }
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    
// buscar pelo index
    
    public String buscar(int index) throws Exception{
        
        if(!(index>=0&&index<tamanho)){
            throw new Exception("valor não existe");
        }
        return this.elemento[index];
    
}
    
    
    public boolean buscar(String elemento){
        for(int i=0; i<tamanho; i++){
            if(this.elemento[i].equalsIgnoreCase(elemento)){
                return true;
            }
        }
        
        return false;
    }
    
    public int buscar2(String elemento){
        for (int i = 0; i < this.tamanho; i++) {
           if(this.elemento[i].equalsIgnoreCase(elemento)) 
        return i;
        }
        return -1;
    }

    public boolean add( int posicao, String elemento) throws Exception{
        
           if(!(posicao>=0&&posicao<tamanho)){
            throw new Exception("valor não existe");
        }
        this.aumentarCapacidade();
        
           for(int i=tamanho-1;i>=posicao;i--){
               this.elemento[i+1]=this.elemento[i];
              
           }
              this.tamanho++;
              this.elemento[posicao]=elemento;
               
        return true;
    }
    
    public void remove(int posicao) throws Exception{
         if(!(posicao>=0&&posicao<tamanho)){
            throw new Exception("valor não existe");
        }
         
         for(int i=posicao;i<this.tamanho-1;i++){
             this.elemento[i]=this.elemento[i+1];
         }
         this.tamanho--;
         
    }
    
    @Override
    public String toString() {
        
        StringBuilder t= new StringBuilder();
        t.append("[");
        for (int i = 0; i < tamanho-1; i++) {
            t.append(this.elemento[i]);
            t.append(",");
        }
        if(this.tamanho>0){
        t.append(this.elemento[this.tamanho-1]);
        }
        t.append("]");
        return t.toString();
    }
    
    
    
    
}
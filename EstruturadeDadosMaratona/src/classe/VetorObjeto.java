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
public class VetorObjeto {
    
    Object elemento[];
    int tamanho;
    
    public VetorObjeto(int tamanho){
      elemento= new Object[tamanho];  
    this.tamanho=0;
      
    }
    
    //adicionar
    public boolean add(Object elemento){
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
            Object elementosNovos[]= new Object[this.elemento.length*2];
            
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
    
    public Object buscar(int index) throws Exception{
        
        if(!(index>=0&&index<tamanho)){
            throw new Exception("valor não existe");
        }
        return this.elemento[index];
    
}
    
    
    public boolean buscar(Object elemento){
        for(int i=0; i<tamanho; i++){
            if(this.elemento[i].equals(elemento)){
                return true;
            }
        }
        
        return false;
    }
    
    public int buscar2(Object elemento){
        for (int i = 0; i < this.tamanho; i++) {
           if(this.elemento[i].equals(elemento)) 
        return i;
        }
        return -1;
    }

    public boolean add( int posicao, Object elemento) throws Exception{
        
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

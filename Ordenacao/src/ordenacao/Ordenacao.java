/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

/**
 *
 * @author Sobral
 */
public class Ordenacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int n[]= {2,3,5,1,8};
        int aux=0;
        int i=0;
        System.out.println(" sem ordenar");
        for(i=0;i<n.length;i++){
            System.out.println(" "+n[i]);
        }
        
        for( i=0;i<n.length;i++){
           
            for(int j=0;j<n.length-1;j++){
                if(n[j]>n[j+1]){
                    aux=n[j];
                    n[j]=n[j+1];
                    n[j+1]=aux;
                    
                }
            }
        }
        System.out.println(" ordenado ");
        for(int organ:n){
            System.out.println(" "+ organ);
        }
        
        
    }
    
}

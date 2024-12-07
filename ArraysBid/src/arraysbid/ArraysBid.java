/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysbid;

/**
 *
 * @author Sobral
 */
public class ArraysBid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        float n[][]=new float[4][3];
       //vetores dos titulos das colunas
        n[0][0]=1;
        n[1][0]=2;
        n[2][0]=3;
        n[3][0]=4;
        
        //vetores das linhas ou conteudos do vetor
        n[0][1]=1.1f;
        n[0][2]=1.2f;
        
        
        System.out.println(n[0][0]+" "+n[1][0]+" "+n[2][0]+""+n[3][0]);
        System.out.println(n[0][1]);
        System.out.println(n[0][2]);
        
       
     
        
        
        
    }
    
}

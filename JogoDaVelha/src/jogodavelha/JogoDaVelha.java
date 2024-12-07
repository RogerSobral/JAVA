/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Sobral
 */
public class JogoDaVelha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        boolean venceu=false;
        Scanner teclado=new Scanner(System.in);
        String casa[][]=new String[3][3];
        String jogador="X";
        
       
        int coluna=0;
        int linha=0;
        
        System.out.println("Vamos iniciar o jogo, boa sorte !");
        do{
            
            
           // while(casa[linha][coluna]!="x"||casa[linha][coluna]!="o"){
              
          
            System.out.println("jogador "+ jogador);
            System.out.println("qual a linha "); 
            linha=teclado.nextInt();
            System.out.println("qual a coluna ");
            coluna= teclado.nextInt();
            //}
            
            
            
            
            
            switch(jogador){
                case "X":
                  casa[linha][coluna]="x";
                  break;
                case "O":
                    casa[linha][coluna]="O";
            }
           
          
         
            
            
            
          
         
            // codigo para que o jogador do x vença
         if("x".equalsIgnoreCase(casa[0][0])&&"x".equalsIgnoreCase(casa[0][1])&&"x".equalsIgnoreCase(casa[0][2])){
             System.out.println("o jogador 1 venceu");
             venceu=true;         
         }  else if("x".equalsIgnoreCase(casa[0][0])&&"x".equalsIgnoreCase(casa[1][0])&&"x".equalsIgnoreCase(casa[2][0])){
            System.out.println("o jogador 1 venceu");
             venceu=true;    
         } else if( "x".equalsIgnoreCase(casa[0][0])&&"x".equalsIgnoreCase(casa[1][1])&&"x".equalsIgnoreCase(casa[2][2])){
            System.out.println("o jogador 1 venceu");
             venceu=true;   
         }else if ("x".equalsIgnoreCase(casa[1][0])&&"x".equalsIgnoreCase(casa[1][1])&&"x".equalsIgnoreCase(casa[1][2]) ){
             System.out.println("o jogador 1 venceu");
             venceu=true;
         } else if ("x".equalsIgnoreCase(casa[0][2])&&"x".equalsIgnoreCase(casa[1][2])&&"x".equalsIgnoreCase(casa[2][2])  ){
            System.out.println("o jogador 1 venceu");
             venceu=true; 
         }else if( "x".equalsIgnoreCase(casa[0][2])&&"x".equalsIgnoreCase(casa[1][1])&&"x".equalsIgnoreCase(casa[2][0])){
           System.out.println("o jogador 1 venceu");
             venceu=true;   
         }else if("x".equalsIgnoreCase(casa[2][0])&&"x".equalsIgnoreCase(casa[2][1])&&"x".equalsIgnoreCase(casa[2][2])){
            System.out.println("o jogador 1 venceu");
             venceu=true;   
         }
         
         //codigo para o jogador do 0 vença
         
         
           if("o".equalsIgnoreCase(casa[0][0])&&"o".equalsIgnoreCase(casa[0][1])&&"o".equalsIgnoreCase(casa[0][2])){
             System.out.println("o jogador 2 venceu");
             venceu=true;         
         }  else if("o".equalsIgnoreCase(casa[0][0])&&"o".equalsIgnoreCase(casa[1][0])&&"o".equalsIgnoreCase(casa[2][0])){
            System.out.println("o jogador 2 venceu");
             venceu=true;    
         } else if( "o".equalsIgnoreCase(casa[0][0])&&"o".equalsIgnoreCase(casa[1][1])&&"o".equalsIgnoreCase(casa[2][2])){
            System.out.println("o jogador 2 venceu");
             venceu=true;   
         }else if ("o".equalsIgnoreCase(casa[1][0])&&"o".equalsIgnoreCase(casa[1][1])&&"o".equalsIgnoreCase(casa[1][2]) ){
             System.out.println("o jogador 2 venceu");
             venceu=true;
         } else if ("o".equalsIgnoreCase(casa[0][2])&&"o".equalsIgnoreCase(casa[1][2])&&"o".equalsIgnoreCase(casa[2][2])  ){
            System.out.println("o jogador 2 venceu");
             venceu=true; 
         }else if( "o".equalsIgnoreCase(casa[0][2])&&"o".equalsIgnoreCase(casa[1][1])&&"o".equalsIgnoreCase(casa[2][0])){
           System.out.println("o jogador 2 venceu");
             venceu=true;   
         }else if("o".equalsIgnoreCase(casa[2][0])&&"o".equalsIgnoreCase(casa[2][1])&&"o".equalsIgnoreCase(casa[2][2])){
            System.out.println("o jogador 2 venceu");
             venceu=true;   
         } 
         
         switch(jogador){
             case "X":
                 jogador="0";
                 break;
             case "O":
                 jogador="X";
                 break;
         }
         
            
        }while(!venceu);
       //1º[] linha  2º[]coluna
       
        System.out.println("Esse jogo funcionou rsrs  ");
       
        
        
    }
    
}

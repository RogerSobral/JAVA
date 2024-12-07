/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocliente;

import java.util.Scanner;

/**
 *
 * @author Sobral
 */
public class CadastroCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        String colunas[][]=new String[3][5]; 
       colunas[0][0]="RGM";
       colunas[0][1]="nome";
       colunas[0] [2]="Sobrenome";
       colunas[0][3]="salario";
       colunas[0][4]="total";
       
       double salario[]=new double[3];
       // x linhas y colunas
       for(int x=0;x<3;x++){
           for( int y=0;y<5;y++){
               
               if(y==0&&(x==1||x==2)){
               System.out.println("digite o seu RGM");
               colunas[x][y]=teclado.next();
              
               
               
               
               
               
               }else if(y==1&&(x==1||x==2)){
                 System.out.println("digite o seu nome");
               colunas[x][y]=teclado.next();  
               
               }else if(y==2&&(x==1||x==2)){
                     System.out.println("digite o seu Sobrenome");
               colunas[x][y]=teclado.next(); 
               
               }else if(y==3&&(x==1||x==2)){
                   System.out.println("digite o seu salario");
               colunas[x][y]=teclado.next();  
               
               
               } 
               
               
           }
       }
       
       for(int x=1;x<3;x++){
       
       salario[x]=Double.parseDouble(colunas[x][5]);
       }
       
       
     double total=0;
       
     for(int c=1;c<3;c++){
         total+=salario[c];  
       }
     
     
       //imprimir na tela os as informações 
       for(int x=0;x<5;x++){
       
               System.out.print(colunas[0][x]+",");  
       }
       
       System.out.println(" "); 
      
       for(int x=0;x<5;x++){
          System.out.print(colunas[1][x]+",");
          
      }
      
       System.out.println(" "); 
       
       for(int x=0;x<5;x++){
          System.out.print(colunas[2][x]+",");
       
      }
       
        System.out.println("o total dos salarios é de R$"+total);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideporzero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sobral
 */
public class DividePorZero {

    public static void dividir ( Scanner c1, Scanner c2) throws InputMismatchException, ArithmeticException
    {
        System.out.println("Numero: ");
        int a=c1.nextInt();
        
        System.out.println("Divisor: ");
        int b=c2.nextInt();
        
            System.out.println((a/b));
    }
        
    
    
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
        
         boolean continuar=true;
         
         do{
         try{
       
        dividir(teclado, teclado);
        continuar=false;
        
       } catch(InputMismatchException | ArithmeticException e1){
            System.err.println("somente numeros inteiros sem letras e não zero ");
        teclado.nextLine();
       }
         finally{
             System.out.println("o finally foi execultado");
         }
         }while(continuar);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticimport;
import static  java.lang.Math.*;
/**
 *
 * @author Sobral
 */
public class StaticImport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
      
        Double n1= 12.5;
        Double n2=(double) 10;
        
        System.out.println(exp(n1.doubleValue()));
        System.out.println(pow(n1.doubleValue(), n2.doubleValue()));
        
        
    }
    
}

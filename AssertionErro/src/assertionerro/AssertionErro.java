/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertionerro;

import javax.swing.JOptionPane;

/**
 *
 * @author Sobral
 */
public class AssertionErro {

   
    public static void main(String[] args) {
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
       
        assert (n>= 1 && n<=10):"numero invalido"+ n;
            System.out.println("vc entro com valor certo ");
            
        
    }
    
}

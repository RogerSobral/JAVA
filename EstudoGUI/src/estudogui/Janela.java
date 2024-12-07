/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudogui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Sobral
 */
public class Janela extends JFrame{

    public Janela(){
       super ("Minha Janela");
        
        JButton botao= new JButton("Clique");
        getContentPane().add(botao);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ao clicar no botão ele fecha o fecha a aplicação inteira  com esse parametro 
        //
        
        
        setSize(300, 300);// define o tamanho da janela 
        setVisible(true);// define se ela é visivel ou nao 
        
        
    }
    public static void main(String[] args) {
    
        new Janela();
        
    }
    
}

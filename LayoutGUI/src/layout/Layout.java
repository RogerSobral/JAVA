/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author Sobral
 */
public class Layout extends JFrame {

   public Layout(){
       super("Meu Layout");
       
       //LAYOUT PADRAO 
       Container c=getContentPane();// receber a configuração de content para um container 
//       c.add(BorderLayout.NORTH, new JButton("1")); // determinando a posição do botao 
//       c.add(BorderLayout.SOUTH, new JButton("2"));
//       c.add(BorderLayout.CENTER, new JButton("3"));
//       c.add(BorderLayout.WEST, new JButton("4"));
//       c.add(BorderLayout.EAST, new JButton("5"));
       
        /*
       North= norte
       South= sul
       Center= centro
       west=oeste
       East= lest
       */
       
       //OUTROS LAYOUT  
       
      c.setLayout( new FlowLayout()); // add os buttons por ondem de chegada lado a lado
      c.add(new JButton("1"));
      c.add(new JButton("2"));
      c.add(new JButton("3"));
      c.add(new JButton("4"));
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(400,400);
       setVisible(true);
       
   }
    
    
    public static void main(String[] args) {
        new Layout();
    }
    
}

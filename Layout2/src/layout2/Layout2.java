/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Sobral
 */
public class Layout2 extends JFrame {

  public Layout2(){
      super("Layout 2");
      
      Container c=getContentPane();// carregar a variavel abstrata com as funçoes do metodos contentPane
//      c.setLayout(new BorderLayout());// espaçamento zero entre os elementos 
/*
      c.setLayout(new BorderLayout(5,5));// agora vamos definir os espaçamento entre os elementos de 5px por 5px
      c.add(BorderLayout.NORTH,   new JButton("N"));
      c.add(BorderLayout.SOUTH, new JButton("S"));
      c.add(BorderLayout.EAST, new JButton("E"));
      c.add(BorderLayout.CENTER,  new JButton("C"));
      c.add(BorderLayout.WEST, new JButton("W"));
     
      
      //GUID LAYOUT 
      // trabalha gerando um layout em grade para os elementos 
      c.setLayout(new GridLayout(2     ,     3));
      //                        (linhas, colunas)
      c.add( new JButton("a"));
      c.add( new JButton("b"));
      c.add( new JButton("c"));
      c.add( new JButton("d"));
      c.add( new JButton("e"));
      c.add( new JButton("f"));
 */
      
      //TRABALHANDO DO COM DOIS LAYOUTS AO MESMO TEMPO 
     
      c.setLayout(new BorderLayout());
             
    
     Container c2= new JPanel();
     c2.setLayout(new GridLayout(4,1));
     c2.add(new JButton("OK"));
     c2.add(new JButton("Cancel"));
     c2.add(new JButton("Setup"));
     c2.add(new JButton("Help"));
     
      
     c.add(BorderLayout.CENTER, new JButton("Centro"));
     c.add(BorderLayout.EAST,c2);
      
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     setSize(400,400);
      
      
      
  }
    
    
    public static void main(String[] args) {
       
        new Layout2();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotosestudo;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sobral
 */
public class FotosEstudo extends JFrame implements ActionListener{

   public FotosEstudo(){
       super("fotos");
       Container c=getContentPane();
       
       c.setLayout(new FlowLayout());
       
       ImageIcon icon= new ImageIcon(getClass().getResource("mulher.jpg"));
      
       JButton botao= new JButton("aqui");
       botao.addActionListener(this);
       JLabel label= new JLabel(icon);
       label.setForeground(Color.red);
       label.setToolTipText("sobre o mouse");// com isso vc pode fazer aparecer um texto sobre o label quando passa o mouse
       
       
       c.add(label);
       c.add(botao);
       
       setVisible(true);
       setSize(300,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   
    public static void main(String[] args) {
      
        new FotosEstudo();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("sobral é o cara");
    }
    
}

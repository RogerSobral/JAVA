/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sobral
 */
public class Calculadora  extends JFrame{

  
    JTextField display= new JTextField();
    JButton zero= new JButton("0");
    JButton um= new JButton("1");
    JButton dois= new JButton("2");
    JButton tres= new JButton("3");
    JButton quatro= new JButton("4");
    JButton cinco= new JButton("5");
    JButton seis= new JButton("6");
    JButton sete= new JButton("7");
    JButton oito= new JButton("8");
    JButton nove= new JButton("9");
    JButton menos= new JButton("-");
    JButton mais= new JButton("+");
    JButton multiplicacao= new JButton("x");
    JButton divisao= new JButton("/");
    JButton igual= new JButton("=");
    JButton ponto= new JButton(".");
    
    
    
    
    public Calculadora(){
        super("Calculadora");
         
        
        Container c1=getContentPane();
        c1.setLayout( new BorderLayout());
        
        display.setFont(new Font("serif", Font.PLAIN, 26));
        c1.add(BorderLayout.NORTH,display);
        
        Container c2= new JPanel();
        c2.setLayout(new GridLayout(4,4,5,5));// os dois ultimos definem o espaçamentos
        c2.add(sete);
        c2.add(oito);
        c2.add(nove);
        c2.add(divisao);
        c2.add(quatro);
        c2.add(cinco);
        c2.add(seis);
        c2.add(multiplicacao);
        c2.add(um);
        c2.add(dois);
        c2.add(tres);
        c2.add(menos);
        c2.add(zero);
        c2.add(ponto);
        c2.add(igual);
        c2.add(mais);
        
        c1.add(BorderLayout.NORTH,display);
        c1.add(BorderLayout.CENTER,c2);
        
        
        
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    
    
    
    public static void main(String[] args) {
        
        new Calculadora();
        
    }
    
}

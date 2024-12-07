/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlecombo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sobral
 */
public class ControleCombo extends JFrame {

    JComboBox<String> combo;
    JLabel label;
    ImageIcon[] imagens={
                 new ImageIcon(getClass().getResource("1.jpg")),
                 new ImageIcon(getClass().getResource("2.jpg")),
                 new ImageIcon(getClass().getResource("3.jpg")),
                 new ImageIcon(getClass().getResource("4.jpg"))
    };
    
    public ControleCombo(){
        super("Album");
        
        combo= new JComboBox<String>();
        combo.setFont(new Font("serif",Font.PLAIN,26));
        combo.addItem("gradiador");
        combo.addItem("Gata");
        combo.addItem("filme");
        combo.addItem("mulher");
        combo.addItemListener( new comboeItemListener());
        
        label= new JLabel(imagens[0]);
        
        Container c=getContentPane();
        
        c.add(BorderLayout.NORTH,combo);
        c.add(BorderLayout.CENTER,label);
        
        setSize(300,540);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    
    class comboeItemListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
         
            if(e.getStateChange()==ItemEvent.SELECTED){
             label.setIcon(imagens[combo.getSelectedIndex()]);
         }
            
        }
        
    }
    public static void main(String[] args) {
    new ControleCombo();
        
    }
    
}

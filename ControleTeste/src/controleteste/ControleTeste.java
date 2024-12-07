/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleteste;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sobral
 */
public class ControleTeste extends JFrame {

    JButton ok= new JButton ("OK");
    JButton cancel= new JButton ("Cancel");
    JTextField login= new JTextField();
    JPasswordField senha= new JPasswordField();
    
   public ControleTeste(){
       
       super("Textos e Senhas");
       
       ok.addActionListener(new buttonOkListener());// aqui esta sendo chamado a classe no lugar de chamar o metodo  da interface ActionListener
       cancel.addActionListener(new buttonCancelListener()); // aqui esta sendo chamado a classe no lugar de chamar o metodo  da interface ActionListener
       
       
       
       Container c=getContentPane();
       c.setLayout(new GridLayout(3,2));
       c.add(new JLabel("Login:"));
       c.add(login);// colcoar texto logo apos
       c.add(new JLabel("Senha:"));
       c.add(senha);
       c.add(ok);
       c.add(cancel);
       
       setSize(300,200);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   
   // Class to the button OK
   class buttonOkListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String s="login: "+login.getText()+"\n senha: "+new String(senha.getPassword()); 
            JOptionPane.showMessageDialog(null,s);
        }
       
       
   }
   
   // class to the button cancel
   class buttonCancelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
         login.setText("");
         senha.setText("");
        }
       
   }
  
    
    
    
    
    
    public static void main(String[] args) {

   new ControleTeste();

    }

   
    
}


package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Eventos extends JFrame implements ActionListener  {

    JButton botao;
   
    public Eventos(){ // construtor
        super("Eventos");
        
        botao= new JButton("clique");
        botao.addActionListener(this);
        getContentPane().add(botao);
        
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {

       botao.setText("foi clicado");
       
    }
    
    
    
    public static void main(String[] args) {
            
        new Eventos();



    }

    
    
}


package controlecheck;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ControleCheck extends JFrame {

     JTextField texto;
    JCheckBox bold= new JCheckBox("Bold");
    JCheckBox italic=new JCheckBox("Italic");
    JLabel n;
    public ControleCheck(){
        super("Check");
        texto= new JTextField("Veja a fonte mudar", 13);
        
        texto.setFont(new Font("serif",Font.PLAIN,26));
        
        //eventos do checkbox
        bold.addItemListener( new checkListener());
        italic.addItemListener(new checkListener());
        
        Container c2= new JPanel();
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(texto);
        c.add(bold);
        c.add(italic);
        
         n= new JLabel("aqui vem o texto");
        c.add(n);
        
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class checkListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(bold.isSelected() && italic.isSelected()){
                texto.setFont(new Font("serif", Font.BOLD | Font.ITALIC,26));// formatação bold e italic
                n.setText("é mulher sem duvida");
            }else if(bold.isSelected()){
                texto.setFont(new Font("serif", Font.BOLD,26));// formatação Bold
            }else if(italic.isSelected()){
                texto.setFont(new Font("serif", Font.ITALIC,26));// formataçao italic
            }else{
                texto.setFont(new Font("serif", Font.PLAIN,26));// formatação padrao 

            }
        }
        
    }
    
    
        
    
    public static void main(String[] args) {
      new ControleCheck();
        
        
        
    }
    
}

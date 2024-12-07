
package controlejlabel;

        
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ControleJlabel extends JFrame implements ActionListener {

  public ControleJlabel(){
      super("Label");
      
      JButton botao=new JButton("clique");
      botao.addActionListener(this);
      
      
      JLabel simple= new JLabel("aqui vai um texto");
      simple.setToolTipText("meu tool tip");// é um enevento de quando vc passa o mouse por cima do controle
      
      
      Font fonte= new Font("serif", Font.BOLD |Font.ITALIC, 28);
      JLabel label= new JLabel("segundo texto");
      label.setFont(fonte);
      label.setForeground(Color.YELLOW);
      
      ImageIcon icon= new ImageIcon(getClass().getResource("fotos/PanicButton2.png"));
      JLabel imagem= new JLabel(icon);
      
      
      Container c=getContentPane();
      c.setLayout(new FlowLayout());
      c.add(simple);
      
      c.add(label);
      
      c.add(imagem);
      
      
      
      setSize(300,300);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
   @Override
    public void actionPerformed(ActionEvent e) {



    }
    
    
    public static void main(String[] args) {
     
        new ControleJlabel();
        
        
    }

   
    
}

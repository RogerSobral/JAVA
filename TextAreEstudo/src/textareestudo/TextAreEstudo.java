
package textareestudo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextAreEstudo extends JFrame implements ActionListener{

      JTextArea texto;
      
    public TextAreEstudo(){
        super("Text Area");
         texto= new JTextArea();// define um obejto que vai servir como editor de texto
        texto.setFont(new Font("serif",Font.PLAIN,26));// configuração ds fontes da area de texto do editor
        JScrollPane painel= new JScrollPane(texto);// barra de rolagem para quando os elementos forem amiores do que o campo normal da tela
        
        JButton botao= new JButton("Abrir Arquivo");
        
        botao.setFont(new Font("serif",Font.BOLD,22));
        botao.addActionListener(this);
        
        Container c=getContentPane();
        c.add(BorderLayout.CENTER,painel);
        c.add(BorderLayout.SOUTH,botao);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
  
    
      @Override
    public void actionPerformed(ActionEvent e) {
        
        JFileChooser c= new JFileChooser();// estancia um objeto que seleciona arquivos no pc
        c.showOpenDialog(this); // aqui vc esta usando o metodo para buscar o arquivo no computador atraves de uma interface
        // aqui vc pega o arquivo selecionado e abre ele
//        c.getSelectedFiles(); esse medoto retorna uma lista de arquivos
        File file=c.getSelectedFile();
        
        try{
            
            Path peth=Paths.get(file.getAbsolutePath());
          String  retorno= new String(Files.readAllBytes(peth));
            texto.setText(retorno);
          
        }catch(Exception erro){
            
            JOptionPane.showMessageDialog(this, "erro na tentativa de abrir o arquivo");
        }
        
    }
    
    public static void main(String[] args) {
new TextAreEstudo();

    }

  
    
}

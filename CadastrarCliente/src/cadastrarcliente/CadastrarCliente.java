/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrarcliente;

import com.sun.xml.internal.bind.api.impl.NameConverter;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sobral
 */
public class CadastrarCliente extends JFrame {

    Path path=Paths.get("C:/revisao/files/clientes.txt");
    Charset utf8=StandardCharsets.UTF_8;
    
    
    
    JButton gravar= new JButton("Gravar");
    JButton dados= new JButton("Dados");
    JTextField nome = new JTextField();
    JTextField idade = new JTextField();
    JTextField saldo = new JTextField();
    
    
    public CadastrarCliente(){
        super("Cadastro");
        
        gravar.addActionListener( new buttonGravar());
        dados.addActionListener(new buttonDados());
        
        Container c=getContentPane();
        c.setLayout( new GridLayout(4,2));
        c.add(new JLabel("Nome:"));
        c.add(nome);
        c.add(new JLabel("Idade:"));        
        c.add(idade);
        c.add(new JLabel("Saldo:")); 
        c.add(saldo);
        c.add(gravar);
        c.add(dados);
                
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
    class buttonGravar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    
}
    
    class buttonDados implements ActionListener{

        Cliente c= new Cliente();
        @Override
        public void actionPerformed(ActionEvent e) {
          c.descritivo();
        }
        
    }
    
    
    public void gravar(ArrayList <Cliente> cliente) throws IOException{
        try(BufferedWriter writer=Files.newBufferedWriter(path, utf8)){
            for(Cliente c: cliente){
             //   writer.write(str);
            }
            
        }
    }
    
    public static void main(String[] args) {
     CadastrarCliente cli=new CadastrarCliente();
      
      ArrayList <Cliente> cliente= new ArrayList<>();
        
      
      String nome= cli.nome.getText();
      int idade=Integer.parseInt(cli.idade.getText());
      double saldo=Double.parseDouble(cli.saldo.getText());
      
      cliente.add(new Cliente(nome, idade, saldo));
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo3;

import conta.Conta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Sobral
 */
public class Arquivo3 {

   
     
 
   
    public void  armazenarcontas (ArrayList <Conta> clientes) throws IOException{
       
       try (FileOutputStream fos=new FileOutputStream("C:/arquivos/files/cliente.ser")){
           try (ObjectOutputStream oop= new ObjectOutputStream(fos)){
               oop.writeObject(clientes);
               
           }
       }
        
 
     
    }
    
    public ArrayList recuperarContas() throws IOException, ClassNotFoundException{
       
        try (FileInputStream fis= new FileInputStream ("C:/arquivos/files/cliente.ser")){
            try(ObjectInputStream ois= new  ObjectInputStream (fis)){
           return (ArrayList<Conta>) ois.readObject();
                
            }
        }
        
    }
    
    
    
    
    
    
    public static void main(String[] args) throws Exception {
      
      ArrayList <Conta> clientes= new ArrayList<>();
      clientes.add(new Conta("marcos", 1200.00));
      clientes.add(new Conta("rogerio", 1000.50));
      clientes.add(new Conta("marcelo", 2200.76));
      clientes.add(new Conta("Beatriz", 85009.76));
     
      Arquivo3 operacao= new Arquivo3();
     operacao.armazenarcontas(clientes);
       ArrayList <Conta> clientes2=operacao.recuperarContas();
     for( Conta conta:clientes2){
         conta.demonstrativo();
     }
    
      
    
      
     
      
      
      
      
    }
    
}

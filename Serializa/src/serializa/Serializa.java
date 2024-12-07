/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializa;

import conta.Conta;
import exceptions.Excp_cpf;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 *
 * @author Sobral
 */
public class Serializa {

  
    
    public static void main(String[] args) throws IOException, ClassNotFoundException, Excp_cpf {

     String [] nomes={"rogerio", "carlos","pedrao"};
     
     // um array de Contas
//     Conta [] c1= new Conta[3];
//     c1[0]= new Conta("rogerio", 4567.96);
//     c1[1]= new Conta("creuza",78942.96);
//     c1[2]= new Conta("sebastiao", 1234532.96);
     
      Conta  c1= new Conta();
      Conta  c2= new Conta();
     String cpf="0";
     
      c1= new Conta("rogerio", 4567.96);
      c2= new Conta("Marcos", 34578.566);
     // testar o cpf 
       boolean resposta=false;// variavel para resceber o valor de booleano do cpf
    
       try{ //tente 
           cpf="333.222.454-23"; // possivel valor de cpf pra ser testado 
            
      resposta=c1.testarCPF(cpf); //  metodo de deste da cpf retorna um valor logico 
        
         if (resposta==true){ // condicional para saber se a resposta é verdadeira ou nao 
             c1.setCpf(cpf); // armazenamento do cpf caso seja verdadeiro    
         }
    
     }catch(Excp_cpf e){// capiturar excessoes 
         e.getMessage();// mensagem da excessao 
     }
     
     
     // ESCRITA DE OBJETO
     // Classes para gravação de arquivos em Bytes
     FileOutputStream fos= new FileOutputStream("C:/arquivos/files/objeto.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c1);
        oos.writeObject(c2);
        oos.close();
     
        //LEITURA DE OBJETO
        FileInputStream ler= new FileInputStream("C:/arquivos/files/objeto.ser");
        ObjectInputStream ois= new ObjectInputStream(ler);
        
      Conta  nomes1= (Conta) ois.readObject();
      Conta  nomes2= (Conta) ois.readObject(); // o bserve que eu nao precisei referenciar qual é o objeto do tipo conta que quero q ele lei, ele sub entende que é o segundo 
      // naturalmente
      ois.close();
      
      nomes1.demonstrativo();
      nomes2.demonstrativo();
      
      
    }
    
}

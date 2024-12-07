/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streambytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Sobral
 */
public class StreamBytes {

    public void armazenar(ArrayList <Usuario> n) throws FileNotFoundException, IOException{
        
        try(FileOutputStream guardar= new FileOutputStream("C:/estudo/file/usuario.ser")){// usado para criar o caminho no lugar do path
           try(ObjectOutputStream oop= new ObjectOutputStream(guardar)){
               oop.writeObject(n);
              
           } 
        }
    }
    
    public ArrayList<Usuario> recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
        try(FileInputStream fis= new FileInputStream("C:/estudo/file/usuario.ser")){
          try(ObjectInputStream ois= new ObjectInputStream(fis)){
              return (ArrayList<Usuario>)ois.readObject();
          }
        }
    }
            
            
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        ArrayList <Usuario> n=new ArrayList<>();
        
    n.add(new Usuario("carlos",4567.00));
    n.add(new Usuario("Marta",9876.00));
    n.add(new Usuario("Pedrão",4345.00));
    n.add(new Usuario("vivaldo",13,1234.00));
    n.add(new Usuario("Godofredo",9563.00));
        
StreamBytes metodos= new StreamBytes();

metodos.armazenar(n);

ArrayList <Usuario> rec= metodos.recuperar();
for(Usuario c: rec){
    c.demonstrativo();
}

    }
    
}

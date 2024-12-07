/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamcaracteres;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
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
public class StreamCaracteres {

    Path caminho=Paths.get("C:/estudo/file/caracter.txt");
    Path caminho2=Paths.get("C:/estudo/file/caracter2.txt");
    Charset utf8=StandardCharsets.UTF_8;
    
    public void armazenar(ArrayList <Usuario> n) throws IOException{
        try(BufferedWriter escrever=Files.newBufferedWriter(caminho2, utf8)){
            for(Usuario p: n){
                escrever.write(p.getNome()+";"+p.getSaldo()+"\n");
            }
        }
    }
    
    
    public ArrayList <Usuario> recuperar() throws IOException{
        
         ArrayList <Usuario> n=new ArrayList<>();
         
         try(BufferedReader ler=Files.newBufferedReader(caminho,utf8)){
             String linha=null;
             while((linha=ler.readLine())!=null){
                 System.out.println(linha);
                 String []t=linha.split(";");
                 Usuario p= new Usuario(t[0],Integer.parseInt(t[1]),Double.parseDouble(t[2]));
                 n.add(p);
             }
         }
         return n;
    }
   
   
    
    public static void main(String[] args) throws IOException {
        
        ArrayList <Usuario> n=new ArrayList<>();
        
    n.add(new Usuario("carlos",4567.00));
    n.add(new Usuario("Marta",9876.00));
    n.add(new Usuario("Pedrão",4345.00));
    n.add(new Usuario("vivaldo",13,1234.00));
    n.add(new Usuario("Godofredo",9563.00));
        
    
    StreamCaracteres metodos=new StreamCaracteres();
    
//    metodos.armazenar(n);


   

ArrayList <Usuario> user=metodos.recuperar();

for( Usuario v: user){
    v.demonstrativo();
}


    }
    
}

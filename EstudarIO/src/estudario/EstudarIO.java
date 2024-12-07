/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Sobral
 */
public class EstudarIO {

    Path  caminho=Paths.get("C:/revisao/files/texto.txt");// usado para definir o caminho 
    Charset utf8= StandardCharsets.UTF_8; 
    
    public void armazenar(ArrayList<String> nomes) throws IOException{
       
        try(BufferedWriter escrever= Files.newBufferedWriter(caminho, utf8)){
            for( String n:nomes){
                escrever.write(n+";");
            }
        }
        
    }
    
    
    public ArrayList<String> recuperar() throws IOException{
         ArrayList<String> nomes2= new ArrayList<>();
         try(BufferedReader recuperado=Files.newBufferedReader(caminho,utf8)){
             String linha=null;
             if((linha=recuperado.readLine())!=null){
             String t[]= linha.split(";");
             for( String r: t){
                nomes2.add(r); 
             }
             
         }
         }
         return nomes2;
    }
    
    public static void main(String[] args) throws IOException {
        
        /* salvando bytes */
//        byte[] nome= "rogerio;sobral;marcos".getBytes();
//        Files.write(caminho, nome);  
//      byte []abrir= Files.readAllBytes(caminho);
//      String inteiros= new String(abrir);
//      String [] separados= inteiros.split(";");
//      Random aliatorio= new Random();
//        System.out.println(separados[aliatorio.nextInt(separados.length)]);
        
        System.out.println("------------------------------------------------");
       
        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Creuza");
        nomes.add("Sebastiao");
        nomes.add("Maria");
        nomes.add("Jose");
        
        EstudarIO acesso=new EstudarIO();
//        acesso.armazenar(nomes);
        
        for (String g:acesso.recuperar()){
            System.out.println(g);
        }
    }
    
}

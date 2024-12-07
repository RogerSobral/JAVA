/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioestudo;

import com.sun.xml.internal.bind.api.impl.NameConverter;
import com.sun.xml.internal.bind.api.impl.NameConverter.Standard;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Sobral
 */
public class IOestudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        Path path=Paths.get("C:/ioarquivos/files/palavras.txt");
        Files.createDirectories(path.getParent());
     
       Files.write(path,"sobral".getBytes());
       byte [] receber=Files.readAllBytes(path);
        System.out.println(new String(receber));
        
        System.out.println("---------------------------");
        Path copia=Paths.get("C:/ioarquivos/textos/palavras.txt");
        Files.createDirectories(copia.getParent());
        Files.copy(path, copia);
        
//        System.out.println("---------------------------");
//        Path mover=Paths.get("C:/ioarquivos/enviar/palavras.txt");
//        Files.createDirectories(mover.getParent());
//        //Files.move(path, mover,Standard.);
        
//        System.out.println(Files.deleteIfExists(path));
 
    }
    
}

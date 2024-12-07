
package collectiolist;

import java.util.ArrayList;
import java.util.List;




public class CollectioList {

  
    
    
    public static void main(String[] args) {
    
       List<String> lista= new ArrayList (); // a collection list permite elementos duplucados
        
       lista.add("Futbol");
       lista.add("Basquete");
       lista.add("Natação");
       lista.add("Volei");
       lista.add("Judo");// duplicado
       lista.add("Boxe");
       lista.add("Judo");// duplicado
       
        System.out.println(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            String letras= lista.get(i);//add o elementos da lista a string letras
            lista.set(i, letras.toUpperCase());// setting  a collection list to receber the words with UpperCase
            
        }
        
        System.out.println(lista);// print in the tela the lista
        System.out.println(lista.indexOf("BOXE")); //search in the lista através of indexOf
        System.out.println(lista.subList(2, 4));// it  pick up elements of a list through of number of a index
        lista.subList(2, 4).clear();// it clear through of a sublist
        
        System.out.println(lista);
    }
    
}

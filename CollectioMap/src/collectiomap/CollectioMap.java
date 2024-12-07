/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiomap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Sobral
 */
public class CollectioMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Map<String,String> paises= new HashMap<>();
     paises.put("BR", "Brasil");
     paises.put("RU", "Russia");
     paises.put("IN", "Índia");
     paises.put("CN", "China");
        System.out.println(paises);
        
        System.out.println(paises.containsKey("BR"));// ele verifica se ha uma determinanda chave na coleção de paises
        System.out.println(paises.containsValue("Brasil")); // verifica se existe algum conteudo com o nome Brasil
        System.out.println(paises.get("IN"));// recupera um conteudo atraves de um valor de uma chave
        paises.remove("RU");// remove um conteudo atraves de uma chave
        System.out.println(paises);
        
        
        Set<String> keys=paises.keySet();// faz com o que nenhuma chave possa ser duplicada
        for (String key: keys){
            System.out.println(key+" : "+ paises.get(key));
            
        }
    }
    
}

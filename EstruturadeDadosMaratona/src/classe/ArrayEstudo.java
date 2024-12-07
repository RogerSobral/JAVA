/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.ArrayList;

/**
 *
 * @author Sobral
 */
public class ArrayEstudo {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        
        arrayList.add(0,"C");
        
        System.out.println(arrayList);
        
        // ele não ignora o upcase
        System.out.println("Existe o A "+ arrayList.contains("a"));
        
        if(arrayList.indexOf("a")>-1){
            System.out.println("Elemento existe no Array");
        }else{
            System.out.println("Elemento não existe no Arry");
        }
    }
}

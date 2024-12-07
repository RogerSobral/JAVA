/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayearraylist;


import java.util.ArrayList;


/**
 *
 * @author Sobral
 */
public class ArrayEArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        int  e[]= new int[20];
//        int  p[]= new int[20];
//        
//        for (int i = 0; i < e.length; i++) {
//            e[i]=i;
//            
//            if(e[i]%2==0){
//                p[i]=e[i];
//            }
//            
//        }
//        
//        System.out.printf("%s%8s\n","Index","Value");
//       
//        for (int i = 0; i < e.length; i++) {
//            if (p[i]!=0)
//            System.out.printf("%5d%8d\n",i,p[i]);
//        }
//            
      ArrayList <Integer> num= new ArrayList<>();
      num.add(12);
      num.add(28);
      num.add(58);
      num.add(18);
        System.out.println(num.toString());
        System.out.println(num.get(0));// serve para recuperar um determinando elemento atraves do indice do array
        System.out.println(num.size());// tamanho do arraylist
        System.out.println(num.indexOf(58));// retorna o index do elemento pesquisado
        num.remove(2);// remove um elemento traves do indice informado, se for de String vc pode passar a string q deseja remover
      
        System.out.println(num.contains(28));// verifica se contem um determinado  valor de elemento
    }
    
}

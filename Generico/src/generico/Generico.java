/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.util.ArrayList;


public class Generico <E> {//deve-se declarar que a classe recebe e manipula tipos genericos

   Object elemento;// metodos antigo 
   E genericos;// metodos novo 

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
    
    public void setGenericos( E genericos){
        this.genericos=genericos;
       
    }
    
    public E getGenericos(){
        return genericos;
    }
    
    public double somar( ArrayList<? extends Number> lista){// aqui esta sendo declarado que aceita qualquer tipo de number ou filhos de number
       // para trabalhar com pai de number vc deve utilizar no lugar de extends o super
        
        double total=0;
        
        for(Number num:lista){
            total+=num.doubleValue();
        }
        return total;
    
    }
    
    
    public static void main(String[] args) {
        
        Generico g= new Generico();
        Generico <String> gen= new Generico<>();// inicialização para um dado generico da classe, neste caso define-se o tipo   que ele ira resceber
        
        g.setElemento("lago Paranoá");
        
      // g.setElemento(1234);// neste caso aceita a entrada de qualquer tipo de dado
       gen.setGenericos("Rogério Sobral ");
       //gen.setGenericos(1234);// neste caso nao permite outro tipo de dado que nao for String porque na inicialização foi definido que o padrao seria string
       
        String s= (String) g.getElemento();// assim você faz um cast para poder acessar os metodos que so tipo String possui
        System.out.println(s.toUpperCase());
        
        gen.getGenericos().toUpperCase();// com o uso da definição de tipo generico na classe vc pode acessar livrimento os metodos do tipo definido sem precisar faer um casth
        System.out.println(gen.getGenericos().toUpperCase());
    
    
    }
    
    
}

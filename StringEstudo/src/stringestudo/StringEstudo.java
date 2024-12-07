/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringestudo;

import javax.swing.JOptionPane;

/**
 *
 * @author Sobral
 */
public class StringEstudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       String nome= new String ();
       nome="sobral";
       String tel="(11) 4742-7293";
       String vazio=new String();
       
//       operações 
        System.out.println(nome.length()); // numero de caracteres dentro de uma String 
        System.out.println(nome.charAt(2));// chamar um caracter dentro de uma string atraves do indice
        System.out.println(nome.toString());// retorna a representação em String 
   
//        localizações

        System.out.println(tel.indexOf(' '));// vai mostrar a primeira ocorrencia no indice de determinado caracter para ser usado ou string
        System.out.println(tel.lastIndexOf(')'));// mostra a ultima ocorrencia de um determinado caracter ou string
        System.out.println(tel.isEmpty());// verifica se uma string esta vazia ou não se vazia da true se cheia false lembrando que espaços em brancos no java representa um caracter
       
        
//        comparação de Strings
String teste1=")";

boolean verificacao=tel.startsWith(teste1);// verifica se uma determinada String inicia com determinados caracteres ou string
        System.out.println(verificacao);
        
        verificacao=tel.endsWith(teste1);// verifica se uma determinada String termina com determinados caracteres ou string
        System.out.println(verificacao);

int teste2="amor".compareTo("casa");// compara qual palavra vem antes da outra atraves de numeração alfabetica, uma palavra igual marca como 0 letras antes ficam abaixo de 0 e letras acima ficam acima de 0;
 System.out.println(teste2);


 verificacao=tel.regionMatches(true,3, teste1, 0, 1);// verifica se um determinad char ou String esta contida em uma determinada string partindo do indice pesquisado
        System.out.println(verificacao);


////extração de strings 
//
String novo= "O rogério é gato ";
String novo2= novo.substring(12);// pega a string apartir do indice enviado como parametro de inicio
        System.out.println(novo2);
        
        novo2=novo.substring(2, 9);//pega de um pedaço a outro dentro da string passando dois indices de inicio e de final
        System.out.println(novo2);
//        
//        
////modificar

novo2= novo2.concat(" sobral");// concatena uma string a outra
        System.out.println(novo2);
//        
novo2=novo2.replace("o", "u");// subestitui um char/string por outro dentro de uma string
        System.out.println(novo2);
        
        novo2=novo2.replaceFirst("u", "o");// subestitui a primeira ocorrencia de um char/string por outro dentro de uma string
        System.out.println(novo2);
        
        novo2=novo2.replaceAll("u", "o"); // substitui todas as apariçoes de um caracter por outro na String
        System.out.println(novo2);
        
////        Conversão

novo2=novo2.toUpperCase();         //converte para letras maiusculas 
        System.out.println(novo2);
        
        novo2=novo2.toLowerCase(); //converte para letras minusculas 
        System.out.println(novo2);
        
        novo2="    "+novo2.concat("  espaços     ");
          System.out.println(novo2);
        System.out.println(novo2.trim());// remove os espaços existentes antes e depois da string só nao os que estao entre a string
    }
    
}

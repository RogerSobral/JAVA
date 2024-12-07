/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressaoregular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sobral
 */
public class ExpressaoRegular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Expressoes regulares corresponde a um padrao de pesquisa

String padrao= "Java"; // servi como modelo para verificação do que se espera 
String texto="Java"; // corresponde a entrada do valor que sera comparado com o padrao para ser validado

boolean verificacao="java".matches("java");// regex significa expressao regular. Lembrando que é caseSenssitive, para que se posso modificar para maiusculas e minisculas deve-se utilizar modificadores
        //System.out.println(verificacao);
        
//        Modificadores
/*
(?i), ignora  Case
(?x), Comentarios
(?m), multilinhas
(?s), Dottal
*/
boolean nome="carlos".matches("(?im)Carlos");
//        System.out.println(nome);


/* Metacaracteres
. qualquer caracter
\d  digitos      [0-9]
\D  nao digitos  [^0-9]
\s espaços
\S não espaços
\w letras 
\W   não é letras
*/
// lembre-se que cada metacaracter serve para um caracter se precisar validar mais
//que um deve colocar a quantidade necessaria para cada caracter que for validar
boolean n= " ".matches(".");
       
        n=" t".matches("\\s\\w");
// System.out.println(n);

 
 n="08683-170".matches("\\d\\d\\d\\d\\d-\\d\\d\\d");
//        System.out.println(n);
     
        /* quantificadores 
        
        X{n}      X,  exatamente n vezes
        X{n, }    X, pelo  menos n vezes
        X{n, m}   X, pelo menos n mas nao mais do que m vezes
        X?        X,0 ou 1 vez
        X*        X,0 ou + vezes 
        X+        X,1 ou + vezes
        */ 
        // validação de CEP
        n="08683-170".matches("\\d{5}-\\d{2,3}");// X{n}      X,  exatamente n vezes e tambem  X{n, }    X, pelo  menos n vezes
//        System.out.println(n);
        
        // agora vendo os especiais pode se fazer a misturar, verifica quantas vezes uma ocorrencia deve ocorrer 
        n=" ".matches(".?");//0 ou 1 vez
//        System.out.println(n);
        n="2016".matches("\\d*");//0 ou + vezes
//        System.out.println(n);
        
        //validação de data
        
        n="07/12/2016".matches("\\d{2}/\\d{2}/\\d{4}");
//        System.out.println(n);
     
        
        /* METACARACTER DE FRONTEIRA
        
        ^    inicia
        $    finaliza
        |    ou 
       
        */
        
         n="pier21".matches("^(?i)Pier.*");
         n="pier21".matches("^(?i)Pier\\d{2,}|21");
//        System.out.println(n);
        
//        // verificar se ha a ocorrencia de uma palavra no meio do texto
//         n="Tem java no meio do texto".matches(".*(?i)java.*");// aqui ele ignora os caracteres do inicio ate chegar na 
////         palavra desejada e assim faz com os caracteres do final 
//        System.out.println(n);
        
        
        // verificar se ha a ocorrencia de uma palavra no meio do texto
         n="Tem java no meio do texto".matches("^(?i)tem.*(?i)Texto$");// aqui ele ignora os caracteres do inicio ate chegar na 
//         palavra desejada e assim faz com os caracteres do final 
//        System.out.println(n);
        
        // validar questao de sim ou nao 
        n="sim".matches("(?i)sim|(?i)não");
//        System.out.println(n);
        
        
        
/*AGRUPADORES
        
      [...] Agrupamento
        [a-z] alcance
        [a-e] [i-u] união
        [a-z&&[aeiou]] interseção
        [^abc]         Exceção
        [a-z&&[^m-p]] subtração
        \x             fuga literal
        
                */      

   n="Marcos".matches("[A-Z][a-z]*");
//        System.out.println(n);
  n="Caralho".matches("[^abcC]lho");
//       System.out.println(n);
        n="crau".matches("cr[ae]u");
//       System.out.println(n);
       
        n="sobralcomix@gmail.com".matches("\\w+@\\w+\\.\\w{2,3}");// validade Email simples
//       System.out.println(n);

       
       String doce="qual é o doce mais Doce que o doCe ";// procurar uma palavra em um texto
       Matcher matcher=Pattern.compile("(?i)doce").matcher(doce);
      while(matcher.find()){
//          System.out.println(matcher.group());
      }
       
      /*SUBSTITUIÇÕES
     replaceAll(   )
      replace (    )
      */
      
      String rato="o rato rueu a roupa do rei de roma";
      String g=rato.replaceAll("r[aeiou]", "pi");
      
      
      String tab="subestituir todos os espaços por tabulação";
//        System.out.println(tab);
      
       tab="subestituir todos os espaços por tabulação".replaceAll("\\s", "\t");
//        System.out.println(tab);
        
        //-------------------------------------------------------------------------------
//        o codigo abaixo como criar um RE que altere as urls de um site todo automaticamente
        String url="www.xti.com.br/clientes-2011.html";
//        http://www.xti.com.br/2011/clientes.jsp

       String  re="www.xti.com.br/\\w{2,}-\\d{4}.html";
       
       boolean xe=url.matches(re);
       
       re="(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";// o entre parentese torna o texto em uma variavel que pode ser acessada
       
       String r=url.replaceAll(re, "http//$1/$3/$2.jsp");
        System.out.println(r);

        
    }
    
}

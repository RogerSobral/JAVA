/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsbyirdes;

/**
 *
 * @author Sobral
 */
public class StringsByirdes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        StringBuilder
//        StringBuffer são siclonizados são uteis para quando esta em ambiente multiprocessados onde varias requisições a mesma informação
 StringBuffer sobren= new StringBuffer();     
StringBuilder nome=new StringBuilder ("o nome do rapaz é carlos massa ele é top");
      sobren.append(nome);
        nome.append(",mas nao se deve ");
        char t[]={ 'J','a','v','a'};
        
         System.out.println(nome);
       nome.append(t).append(" sei la estou testando");
       nome.delete(7, 20);
        System.out.println(nome);
       
 
    }
    
}

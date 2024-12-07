/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Sobral
 */
public class TestarSenha {

    
    public static void senha (String senha) throws SenhaException
    {
      
        if ("123".equals(senha)){
            System.out.println("validado");
        } else{
           
            throw new SenhaException("senha incorreta");
        }
    }
    
    public static void main(String[] args) {
      
        try{
            senha("123"); 
        }catch(SenhaException e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
}

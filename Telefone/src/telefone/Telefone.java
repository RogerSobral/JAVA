/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefone;

/**
 *
 * @author Sobral
 */
public class Telefone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Pessoa p=new Pessoa("rogerio","(11)4742-7293");
        
        
        try{
            
            p.testandoTelefone();
        }catch(TestarTel e){
            System.err.println( e.getMessage());
           
        }
        
       
        System.out.println(p.getTel());
    }
    
   
    
}

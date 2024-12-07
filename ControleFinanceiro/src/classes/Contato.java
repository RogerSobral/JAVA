/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Sobral
 */
public class Contato {
    
    private String tel;
    private String cel;
    private String email;
    
    public Contato(){
        
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean testarTel(){
        boolean teste=false;
        String mensagem="telefone digitado errado (xx)xxxx-xxxx";
        
      if(this.getTel().matches("\\(\\d{2}\\)\\d{4}\\-\\d{4}")){
         teste=true;
      }
       
        return teste;
    }
    
    
}

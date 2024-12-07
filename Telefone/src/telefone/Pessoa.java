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
public class Pessoa {
    
    private String nome;
    private String tel;
    
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String tel){
        this.nome=nome;
        this.tel=tel;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public void testandoTelefone() throws TestarTel{
        
        if(this.tel.startsWith("(")&&this.tel.regionMatches(3, ")", 0, 1)&&this.tel.length()==13){
            System.out.println("deu certo ate aqui");
            
        }else{
            throw new TestarTel("deve ser formado por 12 digitos no seguinte formato (xx)xxxx-xxxx");
        }
        
    }
  
    
}

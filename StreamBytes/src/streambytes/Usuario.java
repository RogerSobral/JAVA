
package streambytes;


public class Usuario implements java.io.Serializable{
   
private   String nome;
private int idade;
private  double saldo;
    
public Usuario(){
      
  }
  
public Usuario(String nome,int idade,  double saldo){
     this.setNome(nome);
     this.setIdade(idade);
     this.setSaldo(saldo);
}


public Usuario (String nome, double saldo){
    this.setNome(nome);
    this.setSaldo(saldo);
    
}
        
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
  public void demonstrativo(){
      System.out.println("-----------------------------");
      System.out.println("Nome:"+this.getNome());
      System.out.println("Idade:"+this.getIdade());
      System.out.println("Saldo:"+this.getSaldo());
  }
}

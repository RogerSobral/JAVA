/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatistica;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;

/**
 *
 * @author Sobral
 */
public class Estatistica {

    /*ORGANIZAR OS DADOS DA PESQUISA*/
  public int [] organizarFrequencia(int [] respostas){
      int [] frequencia = new int[11];
      for (int i = 0; i <respostas.length; i++) {
                    ++frequencia[respostas[i]];// sera somado mais um em cada frequencia correspondente neste caso o indice i esta 
                    //acessando os resultados do array de perguntas
        }
      return frequencia;
  }
    
   /*GRAVAR OS DADOS EM UM TXT*/
  
  
  /*GRAVAR OS DADOS EM UMA STREAM DE BYTES*/
  
  /*RECUPERAR OS DADOS ARMAZENADOS EM TXT*/
  
  /*RECUPERAR OS DADOS ARMAZENADOS EM STREAM DE BYTES*/
  
  
  /*IMPRIMIR NA TELA*/ 
  public void imprimirTela(int [] frequencia){
      
       System.out.printf("%3s%15s\n", "Respostas","Frequencia");
        
        for (int i = 1; i <frequencia.length; i++) {
             System.out.printf("%5d%16d\n",i,frequencia[i]);
        } 
  }
  
  /*APLICAÇÃO PRINCIPAL*/ 
    public static void main(String[] args) {
      
        
        int [] respostas={1,1,6,8,1,4,5,4,7,3,10}; // primeira analise das respostas
        
        //INSTANCIANDO OBJETOS PARA MANIPULAR OS METODOS DA CLASSE PRINCIPAL
        Estatistica metodosClasse=new Estatistica();
        
        
        //INICIALIZANDO A VARIAVEL QUE VAI RESCEBER O ARRAY DAS FREQUENCIAS JA ORGANIZADAS
        int [] frequencia=metodosClasse.organizarFrequencia(respostas);
       
        
        //INSTANCIANDO OBJETOS PESQUISAS
        ArrayList <Pesquisas> p1=new ArrayList<>();
        
        Calendar dataPesq=Calendar.getInstance();
        dataPesq.set(Calendar.MONTH,6);
        dataPesq.set(Calendar.DAY_OF_MONTH, 12);
        p1.add(new Pesquisas("Contra o Governo", frequencia,dataPesq));
        
        
        // IMPRIMINDO NA TELA
       p1.get(0).descricao();// descrição da pesquisa
       metodosClasse.imprimirTela(p1.get(0).getIndice());// roll organizado dos dados
    
     
     
    }
    
}

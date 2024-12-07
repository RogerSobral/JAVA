/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatacaodatas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Sobral
 */
public class FormatacaoDatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       
        Calendar c=Calendar.getInstance();
        
        c.set(1992, Calendar.FEBRUARY, 12);
        c.set(Calendar.HOUR, 23);
        c.set(Calendar.MINUTE, 30);
        c.set(Calendar.SECOND,23);
        
        Date d=c.getTime();
        
        // FORMATAÇÃO DA DATA PARA O MODELO BRASILEIRO
        // DateFormate so trabalha com objetos do tipo Date nao trabalha com Calendar neste caso deve-se converter de Calendar para Date
        DateFormat f=DateFormat.getDateInstance();// Objeto para formtar a data ele tambem nao é instanciado com new
        System.out.println(f.format(d));// atraves do metodo format vc pode invocar a formatação com um string
     
            // FORMATAÇÃO DA HORA
        f=DateFormat.getTimeInstance();// objeto para que se possa formatar horas minutos e segundos
        System.out.println(f.format(d));
        
        
        
        // FORMATAÇÃO DA DATA E DA HORA 
        f=DateFormat.getDateTimeInstance();// objeto para que se possa formatar horas e datas
        System.out.println(f.format(d));
     
        
        // ESTILOS 
        f=DateFormat.getDateInstance(DateFormat.FULL);// escolher o estilo passando um prametro chamado pela classe DateFormat
        System.out.println(f.format(d));// imprime a data com esse formato " Quinta-feira, 13 de Fevereiro de 1992"
        
        
        f=DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(f.format(d));// imprime a data com esse formato " 13 de Fevereiro de 1992"
        
        
        f=DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(f.format(d));// imprime a data com esse formato " 13/02/1992"
        
         f=DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(f.format(d));// imprime a data com esse formato " 13/02/92"
        System.out.println("------------------------------------------------------------------------------");
        
        //CONVERTER UMA STRING EM UMA DATA
        
        String aniversario="12/02/2012";
        f.parse(aniversario); // gera uma excessao a ser tratada chamada ParseException
        Date data2= f.parse(aniversario);// deve-se converter a data de string para que seja carregada em um objeto Date para melhor manipula-lo
        System.out.println(f.format(data2));
        
        
         //SimpleDateFormat
        SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sd.format(data2));// ele é parecido com o DateFormat
        System.out.println(sd.parse(aniversario));// ele tambem possui o metodo parse para converter as String "Sun Feb 12 00:00:00 BRST 2012"
        
         



         
         
        
    }
    
}

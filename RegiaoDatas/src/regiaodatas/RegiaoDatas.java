
package regiaodatas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;



public class RegiaoDatas {

  
    public static void main(String[] args) {
       
        
       Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,1999);
        c.set(Calendar.MONTH,6);
        c.set(Calendar.DAY_OF_MONTH,14);
        Date d=c.getTime();
        
        Locale padrao=Locale.getDefault();// ele recupera no sistema o local padrao/ região
        
        Locale brasil= new Locale("pt","BR"); // vc especifica o local atraves de codigos definidos na ISO 639 para linguas e  ISO 3166 para paises
        // pt= define a lingua e BR= o pais 
        
        
         Locale india= new Locale("hi","IN"); 
        // hi= define a lingua e IN= o pais 
        
        
        Locale usa=Locale.US; 
        // hi= define a lingua e IN= o pais 
        
        
        DateFormat f=DateFormat.getDateInstance(DateFormat.FULL, brasil); // aqui definimos o modelo padrao de formatação como brasil ja configurado 
        System.out.println(f.format(d));
        
        
           f=DateFormat.getDateInstance(DateFormat.FULL, india); // aqui definimos o modelo padrao india  a qual imprimiu "बुधवार, १४ जुलाई, १९९९"
        System.out.println(f.format(d));
    }
    
}

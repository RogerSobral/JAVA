/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatnumeros;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author Sobral
 */
public class FormatNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        double n=123_345.456;
        
        //CHAMANDO O NUMERO FORMATADO
        NumberFormat f=NumberFormat.getInstance();// genericos
        System.out.println(f.format(n));
        
        
        f=NumberFormat.getIntegerInstance();// neste caso de formtara para Integer ele retira a parte fracionada
        System.out.println(f.format(n));
        
        
        f=NumberFormat.getPercentInstance();// formatar para percentuais
        System.out.println(f.format(0.25));
        
        f=NumberFormat.getCurrencyInstance();// formatação para moedas
        System.out.println(f.format(n));
        
        //CONFIGURANDO A FORMATAÇÃO DOS NUMEROS
        
        f.setMaximumFractionDigits(1);// determina com quantas casas decimais vai aparecer o numero 
        System.out.println(f.format(n));
        
        //CONFIGURANDO DA INTERNACIONALIZAÇÃO DOS NUMEROS
        
         f=NumberFormat.getCurrencyInstance(Locale.US);// determinar o local da moeda nos USA
        System.out.println(f.format(n));
        
        
         f=NumberFormat.getCurrencyInstance(Locale.FRANCE);// determinar o local da moeda na França
        System.out.println(f.format(n));
        
        
        f=NumberFormat.getCurrencyInstance();
        System.out.println(f.parse("R$ 2.456,90"));// converter uma String para um double 
        
       
    }
    
}

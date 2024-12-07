
package estudodatacalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class EstudoDataCalendar {

  
    public static void main(String[] args) {
       //  01 janeiro de 1973 é quando ele começa a contar
//        System.out.println(System.currentTimeMillis());  // marca em millisegundo o tempo desde 1973 ate o exato momento
       
        
//        Date Agora=new Date();  
         
//        System.out.println(Agora);
////        System.out.println(Agora.getClass());// verifica a classe
//        
////        System.out.println(Agora.toInstant());
//        Date conf_agora= new Date();// você pode passar a quantidade de millisegundos para configurar uma data
//        
//        System.out.println(conf_agora);
//        conf_agora.setTime(0L);
//        System.out.println(conf_agora); // Tue Dec 30 17:13:20 BRT 1969
        
//        System.out.println(Agora.getTime());// entrega o momento atual em millisegundos 
        
//        Agora.setTime(100_000_000L);// configura a data  em millisegundos, você entra com a data que desenja
        
        
//        System.out.println(Agora.compareTo(conf_agora));// compara datas , se for menor vai retornar uma valor menor do que zero, se maior maior do que zero 
        
        Calendar c=Calendar.getInstance();// vai retornar um calendario na configuração gregoriano
        GregorianCalendar t=new GregorianCalendar();// pode ser instanciado dessa maneira também
        
        c.set(1983,Calendar.JULY,29);// o metodo SET configura o objeto  para resceber uma data especifica 
        System.out.println(c.getTime());// o getTime de Calendar retorna um objeto do tipo date
        // você pode recuperar uma determinada informação do objeto calendar para fazer isso utiliza-se o GET, visto que dentro dos parametros vc chama a Classe Calendar e o elemento que deseja pegar
        
        System.out.println(c.get(Calendar.YEAR));// neste caso desejei recuperar o ano da data cadastrada
        System.out.println(c.get(Calendar.MONTH));// pegando o mes de julho que no caso da leitura do java é o mes 6 pois janeiro é visto com 0
        System.out.println(c.get(Calendar.DAY_OF_MONTH));// no caso do dia vc tem q declarar qual vc deseja saber se da semana do mes ou do ano 
   
    /* ALTERANDO AS INFORMAÇÕES DAS DATAS*/
    
    c.set(Calendar.YEAR, 1981);// neste caso eu defino o que desejo alterar e logo depois configuro a informção 
    c.set(Calendar.MONTH, 0);// aqui estou configurando o mes para janeiro pois é 0
    System.out.println(c.getTime());// aqui a modificação do novo ano e o novo mes ja foi realizada com sucesso.
        
    
    System.out.println(c.get(Calendar.MONTH));
    
    /* LIMPAR CAMPOS*/
    c.clear(Calendar.MINUTE);
    c.clear(Calendar.SECOND);
    
    /* ADD E REMOVER UNIDADES DE TEMPO*/
    // pode-se diminuir ou acrescentar unidades de tempo
    c.add(Calendar.DAY_OF_MONTH, 1);// almentando a unidade de dia do mes , neste caso foi do dia 29 para o dia 30
    c.add(Calendar.YEAR, 1);// adicionarmais uma unidade se o ano era 1981 vai para 1982
    System.out.println(c.getTime());
    
    c.roll(Calendar.DAY_OF_MONTH, 20);// semelhante ao add so que este nao altera o elemento de tempo superior, no caso de estar mexendo nos minutos ele nunca vai alterar a unidade de horas, 
    // no cado de estar mexendo em dias ele nunca vai alterar a unidade de mes ou ano, sempre respeita o lemento de tempo superior
        System.out.println(c.getTime()); // ele nao saiu do mes de janeiro ele somou e voltou a contagem
    
    
    
    }
    
}

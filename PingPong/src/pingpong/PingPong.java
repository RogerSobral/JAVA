/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

/**
 *
 * @author Sobral
 */
public class PingPong extends Thread {

    
    String palavra;
    long tempo;
    public PingPong( String palavra, long tempo){
        this.palavra=palavra;
        this.tempo=tempo;
    }
    public void run(){
        try{
        for (int i = 0; i < 5; i++) {
            System.out.println(palavra); 
            Thread.sleep(tempo);
        }
        }catch(InterruptedException e){
            return;
        }
    }
    
    public static void main(String[] args) {
        
       new PingPong("Ping",1500).start();
       new PingPong("Pong",2000).start();
        
        System.out.println("Ver Thread");

    }
    
}

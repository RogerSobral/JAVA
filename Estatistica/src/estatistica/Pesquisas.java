/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatistica;

import java.util.Calendar;



/**
 *
 * @author Sobral
 */
public class Pesquisas {
    
    private String nome;
    private int[] indice;
    private float media;
    private Calendar data;
    
    
    public Pesquisas(){
        
    }

    public Pesquisas(String nome, int[] indice, Calendar data) {
        this.nome = nome;
        this.indice = indice;
        this.setData(data);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getIndice() {
        return indice;
    }

    public void setIndice(int[] indice) {
        this.indice = indice;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
     public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
    
    public void descricao(){
        System.out.println("------------------------------------------");
        System.out.println("Nome da pesquisa:"+ this.getNome());
        System.out.println("Data da pesquisa:"+ this.getData().getTime());
    }

   
    
    
    
}

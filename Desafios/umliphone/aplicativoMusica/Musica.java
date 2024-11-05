/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafios.umliphone.aplicativoMusica;

/**
 *
 * @author kaka0
 */
public class Musica {
    private String nome;
    private Float duracao;
    private String artista;
    
    public Musica(String nome, Float duracao, String artista){
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getArtista(){
        return this.artista;
    }

    public Float getDuracao(){
        return this.duracao;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Artista: " + artista + ", Duração: " + duracao + " min";
    }
}

package Desafios.umliphone;

import java.util.ArrayList;
import java.util.List;

import edu.kaua.Musica;

public class AppleMusic {
    private List<Musica> playlist;
    private int iteradorPlaylist;
    private Musica musicaAtual;

    public AppleMusic() {
        this.playlist = new ArrayList<>();
        this.iteradorPlaylist = 0;
    }

    public void adicionarMusica(String nome, Float duracao, String artista) {
        playlist.add(new Musica(nome, duracao, artista));
        System.out.println("Música adicionada");
        if(musicaAtual == null){
            musicaAtual = playlist.get(iteradorPlaylist);
        }
    }

    public void play() {
        if (musicaAtual != null) {
            System.out.println("Tocando " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }

    public void pause() {
        if (musicaAtual != null) {
            System.out.println("Pause em " + musicaAtual);
        } else {
            System.out.println("Nenhuma música para pausar.");
        }
    }

    public void proximaMusica() {
        if (iteradorPlaylist < playlist.size() - 1) {
            iteradorPlaylist++;
            musicaAtual = playlist.get(iteradorPlaylist);
            System.out.println("Agora tocando " + musicaAtual);
        } else {
            System.out.println("Você já está na última música.");
        }
    }

    public void musicaAnterior() {
        if (iteradorPlaylist > 0) {
            iteradorPlaylist--;
            musicaAtual = playlist.get(iteradorPlaylist);
            System.out.println("Agora tocando " + musicaAtual);
        } else {
            System.out.println("Você já está na primeira música.");
        }
    }
    
    public int getPlaylistSize(){
        return playlist.size();
    }
    
    public Musica getMusicaAtual() {
    return musicaAtual;
    }
    
    public void getPlaylist(){
        System.out.println(playlist);
    }

    public static void main(String[] args) {
        AppleMusic appleMusic = new AppleMusic();

        // Definindo a música atual como a primeira da playlist
        appleMusic.musicaAtual = appleMusic.playlist.get(appleMusic.iteradorPlaylist);
        
        // Testando as funcionalidades
        appleMusic.play();
        appleMusic.proximaMusica();
        appleMusic.play();
        appleMusic.musicaAnterior();
        appleMusic.play();
        appleMusic.pause();
    }
}

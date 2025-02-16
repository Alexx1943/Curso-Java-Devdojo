package Parte06OrientacaoObjetos.EBlocosInicializacao.Dominio;

public class Anime {

    private String nome;
    private int[] episodios;

    public Anime(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for (int episidio: this.episodios){
            System.out.print(episidio+ " ");
        }

    }

    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }






}

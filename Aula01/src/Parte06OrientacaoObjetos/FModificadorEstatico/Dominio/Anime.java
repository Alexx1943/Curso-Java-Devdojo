package Parte06OrientacaoObjetos.FModificadorEstatico.Dominio;

public class Anime {

    private String nome;
    private static int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;

        }
        for (int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(){
        for(int episodio: Anime.episodios){
            System.out.print(episodio+" ");
        }
    }



    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }






}

package Parte06OrientacaoObjetos.JSobrescrita.Dominio;

public class Anime{
    private String nome;

    @Override
    public String toString(){
        return "Anime: " + this.nome;
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }




}

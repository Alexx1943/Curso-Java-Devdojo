package Parte06OrientacaoObjetos.DConstrutores.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String teste;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero, String teste){
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.teste = teste;
    }
    public Anime(String nome, String tipo, int episodios, String genero, String teste, String estudio){
        this(nome, tipo, episodios, genero, teste);
        this.estudio = estudio;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.teste);
        System.out.println(this.estudio);

    }

    public void setTeste(String teste){
        this.teste = teste;
    }

    public String getTeste(){
        return this.teste;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;

    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }










}

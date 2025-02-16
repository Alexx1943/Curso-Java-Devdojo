package Parte06OrientacaoObjetos.FModificadorEstatico.Dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Velocidade Maxima: "+ this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+ this.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;

    }
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }



    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }













}

package Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome){
        nome = nome;
        System.out.println(nome);
    }
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Valor invalido...");
            return;
        }
        idade = idade;
        System.out.println(idade);
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}

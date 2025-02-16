package Parte06OrientacaoObjetos.IHerenca.dominio;

public class Pessoa {
    protected String nome;
    protected String CPF;
    protected Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }


    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Rua: " + this.endereco.getRua() + ", CEP: " + this.endereco.getCEP());
    }


    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Endereco getEndereco(){
        return endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getCPF(){
        return this.CPF;
    }







}

package Parte06OrientacaoObjetos.KModificadorFinal.Dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString(){
        return "Comprador:" + this.nome;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

}

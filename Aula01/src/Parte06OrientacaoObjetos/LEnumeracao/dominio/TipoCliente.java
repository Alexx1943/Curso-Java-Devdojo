package Parte06OrientacaoObjetos.LEnumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURUDICA(2, "Pessoa juridica");
    public final int valor;
    public String nome;


    TipoCliente(int valor, String nome){
        this.valor = valor;
        this.nome = nome;
    }




}

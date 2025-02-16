package Parte06OrientacaoObjetos.MClassesAbstratatas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        bonus();
    }

    public abstract void bonus();

}

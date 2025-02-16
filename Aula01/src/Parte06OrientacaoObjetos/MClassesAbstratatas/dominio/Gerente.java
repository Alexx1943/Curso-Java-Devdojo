package Parte06OrientacaoObjetos.MClassesAbstratatas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void bonus(){
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString(){
        return "Nome Gerente:" + nome + ", Salário Gerente: R$" + salario;
    }
}

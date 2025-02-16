package Parte06OrientacaoObjetos.MClassesAbstratatas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario ){
        super(nome, salario);
    }

    @Override
    public void bonus(){
        this.salario = this.salario + this.salario * 0.1;
    }

    @Override
    public String toString(){
        return "Nome Desenvolvedor: " + nome + ", Salario Desenvolvedor: R$" + salario;
    }
}

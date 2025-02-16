package Parte06OrientacaoObjetos.IHerenca.dominio;

public class Funcionario extends Pessoa {
    private double salario;


    public Funcionario(String nome){
        super(nome);

    }


    public void imprime(){
        super.imprime();
        System.out.println("Salario: R$" + this.salario);
    }

    public void setSalario(double salario){
        this.salario = salario;

    }
    public double getSalario(){
        return this.salario;
    }







}

package Parte03EstruturasCondicionais;

import java.beans.PropertyEditorSupport;

public class Aula03OperadorTernário {
    public static void main(String[] args){

        double salario = 6000;
        String AcimaDe5000 = "Consigo doar...";
        String AbaixoDe5000 = "Não consigo doar...";
        String Resultado;

        if(salario > 5000){

            Resultado = AcimaDe5000;

        }
        else {

            Resultado = AbaixoDe5000;
        }

        System.out.println(Resultado);



        double Salario = 5000;
        String resultado = salario > 5000 ? "Consigo doar " : "Não consigo";
        System.out.println(resultado);




    }
}

package Parte03EstruturasCondicionais;

public class TabelaVerdadeExercicios {

    public static void main(String[] args){

        double  SalarioAnual = 100000;
        double PrimeiraFaixa = 9.70/100;
        double SegundaFaixa = 37.35/100;
        double TerceiraFaixa = 49.50/100;
        double ValorImposto;

        if(SalarioAnual <= 34712){

            SalarioAnual = SalarioAnual * PrimeiraFaixa;
            
        } else if (SalarioAnual >= 34713 && SalarioAnual <= 68507) {

            SalarioAnual = SalarioAnual * SegundaFaixa;
            
        }
        else
            SalarioAnual = SalarioAnual * TerceiraFaixa;

        System.out.println(SalarioAnual);


    }
}

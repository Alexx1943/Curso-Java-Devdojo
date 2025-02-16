package Parte04EstruturasRepeticao;

public class Aula04ExercicioBreak {
    public static void main(String[] args) {

        double ValorTotal = 30000;
        for (int Parcela = 1; Parcela <= ValorTotal ; Parcela++) {

            double ValorParcela = ValorTotal / Parcela;
            if(ValorParcela >= 1000){
                System.out.println("Parcelas:"+ Parcela + " R$ " + ValorParcela);
            }
            else{
                break;
            }
            System.out.println(Parcela);
            

        }


    }
}

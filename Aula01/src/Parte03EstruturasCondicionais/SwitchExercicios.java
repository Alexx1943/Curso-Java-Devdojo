package Parte03EstruturasCondicionais;

public class SwitchExercicios {
    public static void main(String[] args) {

        char dia = 2;
        switch (dia){

            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
            default:
                System.out.println("Invalido...");
                break;
        }

    }
}

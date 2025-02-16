package Parte06OrientacaoObjetos.PExcecoes.runTime.Teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }

        try {
            talvezException();

        }catch (SQLException e){
            e.printStackTrace();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }

    private static void talvezException() throws SQLException, FileNotFoundException {

    }
}

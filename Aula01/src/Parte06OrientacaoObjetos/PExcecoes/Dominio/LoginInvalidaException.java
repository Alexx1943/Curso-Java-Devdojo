package Parte06OrientacaoObjetos.PExcecoes.Dominio;

public class LoginInvalidaException extends Exception {
    public LoginInvalidaException(){
        super("Login invalido.");
    }
    public LoginInvalidaException(String message){
        super(message);
    }
}

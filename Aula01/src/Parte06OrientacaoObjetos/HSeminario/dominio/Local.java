package Parte06OrientacaoObjetos.HSeminario.dominio;

public class Local {
    private String endereço;

    public Local(String endereço){
        this.endereço = endereço;
    }

    public void imprime(){
        System.out.println("Endereço: " + this.endereço);
    }

    public void setEndereço(String endereço){
        this.endereço = endereço;
    }
    public String getEndereço(){
        return this.endereço;
    }






}

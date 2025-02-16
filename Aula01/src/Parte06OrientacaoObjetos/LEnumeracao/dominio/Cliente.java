package Parte06OrientacaoObjetos.LEnumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString(){
        return "Nome:" + nome
                + ", TipoCliente:" + tipoCliente.nome
                + ", Cliente:" + tipoCliente.valor
                + ", Forma de Pagamento:" + tipoPagamento;
    }








}

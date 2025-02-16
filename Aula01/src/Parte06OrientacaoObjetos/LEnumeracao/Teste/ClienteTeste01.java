package Parte06OrientacaoObjetos.LEnumeracao.Teste;

import Parte06OrientacaoObjetos.LEnumeracao.dominio.Cliente;
import Parte06OrientacaoObjetos.LEnumeracao.dominio.TipoCliente;
import Parte06OrientacaoObjetos.LEnumeracao.dominio.TipoPagamento;


public class ClienteTeste01 {
    public static void main(String[] args) {



       Cliente cliente = new Cliente("Alex", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
       Cliente cliente2 = new Cliente("ATO Holding", TipoCliente.PESSOA_JURUDICA,TipoPagamento.DEBITO);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.desconto(1000));
        System.out.println(TipoPagamento.CREDITO.desconto(1000));

    }
}

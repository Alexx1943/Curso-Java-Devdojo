package Parte06OrientacaoObjetos.BIntroducaoMetodo.Teste;

import Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Alex");
        pessoa.setIdade(-1);
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }


}

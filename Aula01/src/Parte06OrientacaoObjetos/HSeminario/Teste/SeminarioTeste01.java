package Parte06OrientacaoObjetos.HSeminario.Teste;

import Parte06OrientacaoObjetos.HSeminario.dominio.Aluno;
import Parte06OrientacaoObjetos.HSeminario.dominio.Local;
import Parte06OrientacaoObjetos.HSeminario.dominio.Professor;
import Parte06OrientacaoObjetos.HSeminario.dominio.Seminario;

public class SeminarioTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor("Franklin","Matematica");
        Local local = new Local("UniFECAF");
        Aluno aluno = new Aluno("Alex", 28);
        Aluno aluno2 = new Aluno("Alex2", 28);

        Seminario seminario = new Seminario("Lógica");
        Seminario seminario2 = new Seminario("Java");

        Aluno[] alunos = {aluno, aluno2};
        Seminario[] seminarios = {seminario, seminario2};
        Professor[] professores ={professor};

        System.out.println("----Professor----");
        professor.setSeminarios(seminarios);
        professor.imprime();


        System.out.println("----Aluno----");
        aluno.setSeminario(seminario);
        aluno.imprime();

        System.out.println("----Seminario----");
        seminario.setAlunos(alunos);
        seminario.setEndereço(local);
        seminario.setProfessores(professores);
        seminario.imprime();

        System.out.println("----Seminario2----");
        seminario2.setAlunos(alunos);
        seminario2.imprime();





        System.out.println("----Local----");
        local.imprime();





    }
}

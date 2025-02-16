package Parte06OrientacaoObjetos.HSeminario.dominio;

public class Seminario {
    private String titulo;
    private Aluno [] alunos;
    private Local endereço;
    private Professor[] professores;


    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public void imprime(){
        System.out.println("Titulo Seminario: " + this.titulo);
        if (alunos == null) return;
        for (Aluno aluno: alunos){
            System.out.println("Nome Aluno: " + aluno.getNome());
        }

        if (endereço != null){
            System.out.println("Endereço:  " + endereço.getEndereço());
        }

        if (professores == null) return;
        for (Professor professor: professores){
            System.out.println("Nome Professor: " + professor.getNomeProfessor());
        }

    }

    public void setProfessores(Professor[] professores){
        this.professores = professores;
    }
    public Professor[] getProfessores(){
        return this.professores;
    }

    public void setEndereço(Local endereço){
        this.endereço = endereço;
    }
    public Local getEndereço(){
        return this.endereço;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }
    public Aluno[] getAlunos(){
        return this.alunos;
    }

    public void setTitulo(String titulo){
        this.titulo =titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }








}

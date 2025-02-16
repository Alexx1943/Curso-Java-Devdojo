package Parte06OrientacaoObjetos.HSeminario.dominio;

public class Professor {
    private String nomeProfessor;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nomeProfessor, String especialidade){
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
    }
    public void imprime(){
        System.out.println("Nome Professor: " + this.nomeProfessor);
        System.out.println("Especialização: " + this.especialidade);
        if (seminarios == null) return;
        for (Seminario seminario: seminarios){
            System.out.println("Seminario: " + seminario.getTitulo());
        }
    }
    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }
    public Seminario[] getSeminarios(){
        return this.seminarios;
    }
    public void setNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }
    public String getNomeProfessor(){
        return this.nomeProfessor;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }








}

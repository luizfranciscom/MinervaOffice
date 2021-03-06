package cptech.com.controltutor.Controle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aluno on 10/08/2018.
 */

public class Discente extends Usuario {

    private String turma;

    private Professor professor;

    private Tutor tutor;

    private List<Nota> notas;

    private List<Codigo> codigos;

    private boolean ativo;

    public static Discente instance;

    public static Discente getInstance() {
        if(instance == null) {
            instance = new Discente();
        }
        return instance;
    }

    public static void setInstance(Discente discente){
        instance = discente;
    }
    public Discente() {
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public List<Codigo> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Codigo> codigos) {
        this.codigos = codigos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

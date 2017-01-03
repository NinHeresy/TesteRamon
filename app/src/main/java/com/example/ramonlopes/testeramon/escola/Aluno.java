package com.example.ramonlopes.testeramon.escola;

public class Aluno {
    private String nomeAluno;
    private String sexoAluno;
    private String materiaAluno;
    private String listProfMateria;
    private int idadeAluno;
    private int codigoAluno;
/*
    public Aluno(String nomeAluno, String sexoAluno, String materiaAluno, String listProfMateria, int idadeAluno, int codigoAluno) {

        this.nomeAluno = nomeAluno;
        this.sexoAluno = sexoAluno;
        this.materiaAluno = materiaAluno;
        this.listProfMateria = listProfMateria;
        this.idadeAluno = idadeAluno;
        this.codigoAluno = codigoAluno;
    } */

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSexoAluno() {
        return sexoAluno;
    }

    public void setSexoAluno(String sexoAluno) {
        this.sexoAluno = sexoAluno;
    }

    public String getMateriaAluno() {
        return materiaAluno;
    }

    public void setMateriaAluno(String materiaAluno) {
        this.materiaAluno = materiaAluno;
    }

    public String getListProfMateria() {
        return listProfMateria;
    }

    public void setListProfMateria(String listProfMateria) {
        this.listProfMateria = listProfMateria;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public String tostring(){
        return nomeAluno;

    }
}

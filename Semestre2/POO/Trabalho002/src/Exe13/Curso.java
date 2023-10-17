package Exe13;

import java.text.SimpleDateFormat;
import java.util.Date;

class Professor {
    private String nome;
    private String telefoneCelular;
    private double valorHoraAula;

    public Professor(String nome, String telefoneCelular, double valorHoraAula) {
        this.nome = nome;
        this.telefoneCelular = telefoneCelular;
        this.valorHoraAula = valorHoraAula;
    }

    // Getters e setters para os atributos do professor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}

class Curso {
    private String nomeCurso;
    private Date dataInicio;
    private Date dataTermino;
    private String horarioInicio;
    private String horarioTermino;
    private Professor professor;
    private double valorCurso;
    private int cargaHoraria;
    private String conteudoProgramatico;

    public Curso(String nomeCurso, Date dataInicio, Date dataTermino, String horarioInicio, String horarioTermino,
                 Professor professor, double valorCurso, int cargaHoraria, String conteudoProgramatico) {
        this.nomeCurso = nomeCurso;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.professor = professor;
        this.valorCurso = valorCurso;
        this.cargaHoraria = cargaHoraria;
        this.conteudoProgramatico = conteudoProgramatico;
    }

    // Getters e setters para os atributos do curso

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getConteudoProgramatico() {
        return conteudoProgramatico;
    }

    public void setConteudoProgramatico(String conteudoProgramatico) {
        this.conteudoProgramatico = conteudoProgramatico;
    }

        public void imprimir() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome do Curso: " + nomeCurso);
        System.out.println("Data de Início: " + dateFormat.format(dataInicio));
        System.out.println("Data de Término: " + dateFormat.format(dataTermino));
        System.out.println("Horário de Início: " + horarioInicio);
        System.out.println("Horário de Término: " + horarioTermino);
        System.out.println("Professor:");
        System.out.println("Valor do Curso: " + valorCurso);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Conteúdo Programático:\n" + conteudoProgramatico);
    }
}


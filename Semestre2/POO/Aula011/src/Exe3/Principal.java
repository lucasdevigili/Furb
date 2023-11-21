package Exe3;

public class Principal {
    public static void main(String[] args) {
        Professor umProfessor = new Professor("Lucas", "Mnh12", 18);
        ProfDE outroProfessor = new ProfDE("Marcos", "Jhdu389", 45, 1.976);
        ProfessorHorista maisUmProfessor = new ProfessorHorista("Jeferson", "OcUlOs-EsCuRo", 35, 78, 15.943);

        System.out.println(umProfessor.toString() + "\n");
        System.out.println(outroProfessor.toString() + "\n");
        System.out.println(maisUmProfessor.toString());
    }
}

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        String[] respostasRapaz = new String[5];
        String[] respostasMoca = new String[5];
        
        lerRespostas(respostasRapaz, "rapaz");
        lerRespostas(respostasMoca, "moça");
        
        int afinidade = calcularAfinidade(respostasRapaz, respostasMoca);
        
        System.out.println("Afinidade entre o rapaz e a moça: " + afinidade);
    }
    
    public static void lerRespostas(String[] vetor, String pessoa) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Respostas do " + pessoa + ":");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Pergunta " + (i+1) + ": ");
            vetor[i] = scanner.nextLine();
        }
        
        scanner.close();
    }
    
    public static int calcularAfinidade(String[] respostasRapaz, String[] respostasMoca) {
        int afinidade = 0;
        
        for (int i = 0; i < respostasRapaz.length; i++) {
            if (respostasRapaz[i].equalsIgnoreCase(respostasMoca[i])) {
                afinidade += 3;
            } else if (respostasRapaz[i].equalsIgnoreCase("IND") && (!respostasMoca[i].equalsIgnoreCase("IND"))) {
                afinidade += 1;
            } else if ((!respostasRapaz[i].equalsIgnoreCase("IND")) && respostasMoca[i].equalsIgnoreCase("IND")) {
                afinidade += 1;
            } else if (respostasRapaz[i].equalsIgnoreCase("SIM") && respostasMoca[i].equalsIgnoreCase("NÃO")) {
                afinidade -= 2;
            } else if (respostasRapaz[i].equalsIgnoreCase("NÃO") && respostasMoca[i].equalsIgnoreCase("SIM")) {
                afinidade -= 2;
            }
        }
        
        return afinidade;
    }
}

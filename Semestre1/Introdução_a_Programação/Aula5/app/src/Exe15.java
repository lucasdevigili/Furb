import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro de até 3 dígitos: ");
        int numero = teclado.nextInt();
        
        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = (numero % 100) % 10;
        
        System.out.printf("%d centena(s) %d dezena(s) %d unidade(s)", 
            centenas, dezenas, unidades);
            teclado.close();
    }
}

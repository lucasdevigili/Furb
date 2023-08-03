package URI;

import java.util.Scanner;

public class Exe2766 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] UNIVERSIDADES = new String[10];

        for (int i = 0; i < 10; i++) 
            UNIVERSIDADES[i] = teclado.next();
        
            
            System.out.println(UNIVERSIDADES[2]);
            System.out.println(UNIVERSIDADES[6]);
            System.out.println(UNIVERSIDADES[8]);
            
            teclado.close();
    }
}

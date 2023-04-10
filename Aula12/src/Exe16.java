import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro homem");
        int hUm = teclado. nextInt();

        System.out.println("Digite a idade do segundo homem");
        int hDois = teclado. nextInt();

        System.out.println("Digite a idade da primeira mulher");
        int mUm = teclado. nextInt();

        System.out.println("Digite a idade da segunda mulher");
        int mDois= teclado. nextInt();

        int vHomem = 0;
        int nHomem = 0;
        int vMulher = 0;
        int nMulher = 0;

        if (hUm > hDois) {
            vHomem = hUm;
            nHomem = hDois;
        } else {
            nHomem = hUm;
            vHomem = hDois; 
        }

        if (mUm > mDois) {
            vMulher = mUm;
            nMulher = mDois;
        } else {
            nMulher = mUm;
            vMulher = mDois;
        }

        int somaUm = vHomem + nMulher;
        int somaDois = nHomem + vMulher;

        System.out.println("As somas são: " + somaUm + " e: " + somaDois);

        teclado.close();
    }
}
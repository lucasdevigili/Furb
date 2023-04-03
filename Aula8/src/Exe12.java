import java.util.Scanner;
//import java.text.DecimalFormat;

public class Exe12 {
    public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    //DecimalFormat df_2 = new DecimalFormat("0.00");

        int valor;
        valor = teclado.nextInt();

        int cem = valor / 100;
        int cinquenta = (valor - cem) / 50;
        int vinte = (valor - (cinquenta * 100)) / 20;
        int dez = (valor - (vinte * 50)) / 10;
        int cinco = (valor - (dez * 10)) / 5;
        int dois = (valor - (cinco * 5)) / 2;
        int um = (valor - (dois * 2)) / 1 ;

        System.out.println(cem);
        System.out.println(cinquenta);
        System.out.println(vinte);
        System.out.println(dez);
        System.out.println(cinco);
        System.out.println(dois);
        System.out.println(um);

    teclado.close();
    }
}

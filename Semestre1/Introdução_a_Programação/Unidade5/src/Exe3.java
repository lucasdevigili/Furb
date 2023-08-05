import java.text.DecimalFormat;

public class Exe3 {
    public static void main(String[] args) {
        int results = 0;

        DecimalFormat df_3 = new DecimalFormat("0.000");
        for (int i = 1; i <= 100; i++) {
            results += (1/i);
        }
        System.out.println(df_3.format(results));
    }
}

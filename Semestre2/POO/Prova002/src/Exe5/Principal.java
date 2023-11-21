// Lucas Gabriel Devigili

package Exe5;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Interminicipal> frotaInterminicipal = new ArrayList<Interminicipal>();
        frotaInterminicipal.add(new Interminicipal("DXL902", 4, 5, 3));

        ArrayList<Municipal> frotaMunicipal = new ArrayList<Municipal>();
        frotaMunicipal.add(new Municipal("ABC123", 2, 3, 5));
        frotaMunicipal.add(new Municipal("XWZ987", 7, 20, 5));

      

        for (Interminicipal onibus : frotaInterminicipal) {
            System.out.println("Frota Intermunicipal:");
           System.out.println(onibus.getNrAposentados());
        }
        for (Municipal onibus : frotaMunicipal) {
            System.out.println("Frota Municipal:");
           System.out.println(onibus.valorArrecadado());
        }
    }
}

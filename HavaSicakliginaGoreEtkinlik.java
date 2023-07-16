package CaglaSonmez;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;
        System.out.print("Hava'nın sıcaklık derecesini giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapmanızı öneririm. ");
        } else if ((heat >= 5) && (heat <= 15)) {
            System.out.print("Sinemaya gitmenizi öneririm. ");
        } else if ( (heat >= 15) && (heat <=25)) {
            System.out.print("Piknik yapamnızı öneririm. ");
        } else if (heat > 25) {
            System.out.print("Yüzmek için denize veya havuza gitmenizi öneririm. ");
        }


    }
}

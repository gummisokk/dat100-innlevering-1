package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O1 {

    public static void main(String[] args) {
        //b
        int n = 10;
        for (int i = 0; i < n; i++) {
            try {
                int poeng = parseInt(showInputDialog("poeng:"));
                char karakter = poengTilKarakter(poeng);
                showMessageDialog(null, karakter);
            }
            catch(Exception e) {
                showMessageDialog(null, e.getMessage() + ", prøv på nytt");
                n++;
            }
        }
    }

    public static char poengTilKarakter(int poeng){
        //a
        char karakter = 'R';
        if (poeng <= 100) {
            karakter = 'A';
        }
        if (poeng <= 89) {
            karakter = 'B';
        }
        if (poeng <= 79) {
            karakter = 'C';
        }
        if (poeng <= 59) {
            karakter = 'D';
        }
        if (poeng <= 49) {
            karakter = 'E';
        }
        if (poeng <= 39) {
            karakter = 'F';
        }
        if (poeng < 0) {
            karakter = 'R';
        }

        if (karakter == 'R'){
            throw new ArithmeticException("ugyldig poengsum");
        }

        return karakter;
    }
    
}

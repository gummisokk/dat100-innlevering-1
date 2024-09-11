package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O3 {
    public static void main(String[] args) {
        try {
            int n = parseInt(showInputDialog("n: "));
            int fakN = 1;

            if (n <= 0) {
                throw new ArithmeticException("ugyldig verdi");
            }
            
            for (int i = 1; i <= n; i++) {
                fakN *= i;
            }
            showMessageDialog(null, n+"! = " + fakN);
        }
        catch (Exception e){
            showMessageDialog(null, e.getMessage());
        }
    }
}

package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O2 {
    public static void main(String[] args) {
        long bruttoinntekt = parseInt(showInputDialog("bruttoinntekt:"));//i kroner;
        long trinnskatt = (bruttoinntekt * trinnskattPromille(bruttoinntekt)) / 10;// i ører

        showMessageDialog(null, "trinnskatt: " + lesbarPengesum(trinnskatt) + " kr");    
    }

    public static int trinnskattPromille(long inntekt){ //bruker promille i staden for prosent for å sleppe desimalar
        if      (inntekt <= 208050) {return 0;}
        else if (inntekt <= 292850) {return 17;}
        else if (inntekt <= 670000) {return 40;}
        else if (inntekt <= 937900) {return 136;}
        else if (inntekt <= 1350000){return 166;}
        else                        {return 176;}
    }

    public static String lesbarPengesum(long pengIØrer){ //legger til mellomrom og komma
        String peng = ""+pengIØrer;
        try {
            peng = peng.substring(0, peng.length()-2) + "," + peng.substring(peng.length()-2, peng.length());
            System.out.print(peng);
            for (int i = 6; i < peng.length(); i+=4){
                peng = peng.substring(0, peng.length()-i) + " " + peng.substring(peng.length()-i, peng.length());
            }
        }catch(Exception e){}
        return peng;
    }
}

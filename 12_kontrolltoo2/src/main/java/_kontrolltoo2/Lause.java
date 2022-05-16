package _kontrolltoo2;
import java.io.*;
import java.lang.*; 
import java.util.*; 

public class Lause implements Taht{
    public Sona s;
    String lause = "Maali Maasikas on metsas marjul.";

    public int sonadeArvMassiivis(){
        String[] massiiv=s.sonad;
        String lause = Arrays.toString(massiiv);
        int sonadeArv = lause.length();
        return sonadeArv;
    }

    public int sonadeArv(){
        int loendur = 0;
        boolean sona = false;
        int lauseLopp = lause.length() - 1;

        for (int i = 0; i < lause.length(); i++) {
            if (Character.isLetter(lause.charAt(i)) && i != lauseLopp) {
                sona = true;
            } else if (!Character.isLetter(lause.charAt(i)) && sona) {
                loendur++;
                sona = false;
            } else if (Character.isLetter(lause.charAt(i)) && i == lauseLopp) {
                loendur++;
            }
        }
        return loendur;
    }

    public int aTahed(){
        String[] sonad = lause.split("\\W+");
        boolean sona = false;
        int sonadeLoendur = 0;
        int lauseLopp = lause.length() - 1;
        int koguLoendur = 0;
        int loendur = 0;
        char taht = 'a';
        for(int j=0; j < sonad.length; j++){
            String uksikSona = sonad[j];
            loendur = 0;
            for(int i=0; i < uksikSona.length(); i++)
            {    if(uksikSona.charAt(i) == taht)
                    loendur++;
            }koguLoendur+=loendur;
            System.out.println("Sõnas "+uksikSona+ " on a-tähti "+loendur);
        }
        System.out.println("Kokku on lauses a-tähti "+koguLoendur);
        return koguLoendur;
    }

    public int tahtedeArv(char taht){
        return 1;
    }

    public String sona(){
        return "Lahe";
    }

}
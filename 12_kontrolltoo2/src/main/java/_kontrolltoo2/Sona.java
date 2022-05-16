package _kontrolltoo2;
import java.io.*; 
import java.lang.*; 
import java.util.*; 
public class Sona implements Taht{
    String[] sonad = {"pere", "kass", "aabits"};
    String sona = sonad[0];

    public int tahtedeArv(char taht){
        int loendur = 0;

        for(int i=0; i < sona.length(); i++)
        {    if(sona.charAt(i) == taht)
                loendur++;
        }
        return loendur;
    }

    public String sona(){
        return sona;
    }

    public int sonadeArv(){
        String lause = Arrays.toString(sonad);
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
}
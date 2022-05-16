package _kontrolltoo2;
import java.io.*; 
import java.lang.*; 
import java.util.*; 
public class Proov{
    String lause = "Maali Maasikas on metsas marjul.";
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

    public void lisaFaili() throws IOException{
 
        FileWriter fw = new FileWriter("andmed.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(lause);
        bw.close();

    }
}
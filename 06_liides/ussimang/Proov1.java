import java.util.*;
import java.io.*;
public class Proov1{
	public static void main(String[] arg) throws IOException{
		ManguTuum mt=new ManguTuum1();
        ManguTuum uss=new ManguTuum1();
		mt.ounaleJuhuslikKoht();
        uss.paremale();
        uss.samm();
        uss.samm();
		System.out.println(Arrays.toString(mt.ounaKoht()));
		System.out.println(Arrays.deepToString(uss.ussiKohad()));
        new TuumaKaivitaja(uss);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String rida=br.readLine();
            if(rida.length()>0){
                if(rida.charAt(0)=='v'){uss.vasakule();}
                if(rida.charAt(0)=='p'){uss.paremale();}
                if(rida.charAt(0)=='y'){uss.yles();}
                if(rida.charAt(0)=='a'){uss.alla();}
            }
        }
	}
}
import java.util.*;

public class TuumaKaivitaja{
    ManguTuum kaivitatav;
    public TuumaKaivitaja(ManguTuum uusKaivitatav){
        kaivitatav=uusKaivitatav;
        new Timer().scheduleAtFixedRate(new TimerTask(){
            public void run(){
                kaivitatav.samm();
                System.out.println(Arrays.deepToString(kaivitatav.ussiKohad()));
                System.out.println(Arrays.toString(kaivitatav.ounaKoht()));
            }
        }, 0, 2000);
    }
}
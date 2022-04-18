package pr1;

public class UusAuto implements Auto{
    int kiirus = 0;
    int kaik = 0;
    boolean tagurpidikaik = false;

    public void kiirenda(int uusKiirus){
        kiirus = uusKiirus;
        System.out.println("Kiirendan, uus kiirus: "+uusKiirus+" km/h");
    }
    public void pidurda(int uusKiirus){
        kiirus = uusKiirus;
        System.out.println("Pidurdan, uus kiirus: "+uusKiirus+" km/h");
    }
    public void vahetaKaiku(int uusKaik){
        kaik = uusKaik;
        System.out.println("Vahetan käiku, uus käik: "+uusKaik);
    }
    public void tagurda(){
        tagurpidikaik = true;
        System.out.println("Sees on tagurpidikäik");
    }
}
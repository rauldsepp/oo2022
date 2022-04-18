package pr1;

public class UusAuto implements Auto{
    int kiirus = 0;
    int kaik = 0;
    int tagurpidikaik = 0;

    public void kiirenda(int uusKiirus){
        kiirus = uusKiirus;
        System.out.println("Kiirendan, uus kiirus: "+uusKiirus+" km/h");
    }
    public void pidurda(int uusKiirus){
        kiirus = uusKiirus;
        System.out.println("Pidurdan, uus kiirus: "+uusKiirus+" km/h");
    }
    public int vahetaKaiku(int uusKaik){
        kaik = uusKaik;
        return kaik;
    }
    public int tagurda(int uusTagurpidikaik){
        tagurpidikaik = uusTagurpidikaik;
        return tagurpidikaik;       
    }
}
public class Main{
    public static void main(String[] arg){
        UusAuto auto=new UusAuto();
        auto.vahetaKaiku(1);
        auto.kiirenda(15);
        auto.vahetaKaiku(2);
        auto.kiirenda(30);
        auto.pidurda(0);
        auto.vahetaKaiku(0);
        auto.tagurda();
        auto.kiirenda(5);
        auto.pidurda(0);
    }
}
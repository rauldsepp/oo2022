package Tund_7a;

public class hobu2{
    public static int varsaKaal(int emaKaal) {
        int ajutine = emaKaal / 10; //vastsyndinud varsa kaal on alati 10% tema ema kaalust.
        return ajutine;
    }

    public static double paevaHein(double hobuKaal){
        double ajutine2 = hobuKaal * 0.02; //hobune peaks tarbima 2% oma kehakaalust iga paev
        return ajutine2;
    }

    public static void main(String[] args) {
        System.out.println(varsaKaal(450));
        System.out.println(paevaHein(500.0));
    }
    
}
import java.util.ArrayList;

public class Proov1{
    public static double kyljePindaladeSumma(Kujund[] m){
        double summa = 0;
        for(Kujund k: m){summa+=k.kyljePindala();}
        return summa;
    }
    public static double kyljePindaladeSummaList(ArrayList<Kujund> m){
        double summa = 0;
        for(Kujund k: m){summa+=k.kyljePindala();}
        return summa;
    }
    public static void main(String[] arg){
        ArrayList<Kujund> kujundid = new ArrayList<Kujund>();
        Kujund k1=new Risttahukas(2,3,4);
		Kujund k2=new Risttahukas(2,3,4);
		Kujund k3=new Silinder(1,1); 
        kujundid.add(k1);
        kujundid.add(k2);
        kujundid.add(k3);
        System.out.println(k1.kyljePindala());
        System.out.println(kyljePindaladeSummaList(kujundid));

        Kujund[] kd=new Kujund[3];

        kd[0]=new Risttahukas(2, 3, 4);
        kd[1]=new Risttahukas(2, 3, 4);
        kd[2]=new Silinder(1, 1);
        System.out.println(kd[2].kyljePindala());
        System.out.println(kyljePindaladeSumma(kd));

    }
}
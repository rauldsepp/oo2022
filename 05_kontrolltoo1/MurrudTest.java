import java.util.Scanner;
public class MurrudTest {
	
	public static void main(String[] args) {

		Scanner rida=new Scanner(System.in);
		System.out.println("Sisesta esimene lugeja: ");
		double lugeja1=rida.nextDouble();
		System.out.println("Sisesta esimene nimetaja: ");
		double nimetaja1=rida.nextDouble();
        System.out.println("Sisesta teine lugeja: ");
		double lugeja2=rida.nextDouble();
		System.out.println("Sisesta teine nimetaja: ");
		double nimetaja2=rida.nextDouble();

        System.out.println("Esimene murd: "+Math.round(lugeja1)+"/"+Math.round(nimetaja1));
        System.out.println("Teine murd: "+Math.round(lugeja2)+"/"+Math.round(nimetaja2));

        Murrud s=new Murrud();

        double summa = s.liida(lugeja1, nimetaja1, lugeja2, nimetaja2);
        double uusNimetaja = Math.round(nimetaja1*nimetaja2);
        if(Math.round(summa)!=Math.round(uusNimetaja)){
            System.out.println("Summa: "+Math.round(summa)+"/"+Math.round(uusNimetaja));

            double segaarv = s.segaarv(summa, uusNimetaja);
            summa -= (segaarv * uusNimetaja);
            
            if(Math.round(segaarv)!=0){
                System.out.println("Segaarvuga: "+Math.round(segaarv)+" "+Math.round(summa)+"/"+Math.round(uusNimetaja));

                String taandatud = s.murruna(summa, uusNimetaja);
                System.out.println("Taandatud: "+Math.round(segaarv)+" "+taandatud);
            } else {
                String taandatud = s.murruna(summa, uusNimetaja);
                System.out.println("Taandatud: "+taandatud);
            }
        } else {
            System.out.println("Summa: 1");
        }
        
	}
}

import java.util.Scanner;
public class Proov2{
	public static void main(String[] args){
		Scanner esimeneRida=new Scanner(System.in);
		System.out.print("Mitu mängu: ");
		int arvMange=esimeneRida.nextInt();
		for(int j=0; j<arvMange; j++){
			String[] panused=new String[7];
			panused[0]="1";
			panused[1]="2";
			panused[2]="5";
			panused[3]="10";
			panused[4]="20";
			panused[5]="50";
			panused[6]="100";
			System.out.println("Panused: ");
			for(int i=0;i<panused.length;i++){
				System.out.println(panused[i]);
			}
			Scanner rida=new Scanner(System.in);
			System.out.print("Sinu panus: ");
			int panus=rida.nextInt();
			Scanner uusRida=new Scanner(System.in);
			System.out.print("Sinu pakkumine: ");
			double pakkumine=uusRida.nextInt();
			Mangija m1=new Mangija("Raul", Mangija.raha, panus);
			//System.out.println(m1.nimi+", raha: "+Mangija.raha);
			
			
			Mang num=new Mang(0);
			System.out.println(num);
			if(num.number==pakkumine){
				System.out.println("Tubli! Võitsid "+panus+" eurot.");
				Mangija.raha += panus*2;
				System.out.println("Raha: "+Mangija.panusta(panus));
			}
			else{System.out.println("Kahju! Kaotasid "+panus+" eurot.");
			System.out.println("Raha alles: "+Mangija.panusta(panus));}
		}	
	}	
}
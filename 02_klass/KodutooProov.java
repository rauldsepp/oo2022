import java.util.Scanner;
public class KodutooProov{
	public static void main(String[] args){
		Scanner rida=new Scanner(System.in);
		System.out.print("Taringu kulgede arv: ");
		int kulg=rida.nextInt();
		Kodutoo t1=new Kodutoo(kulg);
    	System.out.println(t1.veereta());

	}
}

/*[raurau@greeny 02_klass]$ java KodutooProov
Taringu kulgede arv: 6
6
[raurau@greeny 02_klass]$ java KodutooProov
Taringu kulgede arv: 6
2
[raurau@greeny 02_klass]$ java KodutooProov
Taringu kulgede arv: 6
1*/

public class Proov1{
	public static void main(String[] arg){
		Isikukood raul=new Isikukood("50207040248");
		Isikukood paula=new Isikukood("40207040248");
		System.out.println(raul.sugu()+" "+raul.synniaasta());
		System.out.println(paula.sugu()+" "+paula.kuupaev()+" "+paula.kuu()+" "+paula.synniaasta());
	}
}
public class KolmnurkProov{
	public static void main(String[] arg){
		Kolmnurk k1=new Kolmnurk(0, 0, 3, 4, 4, 3);
		Kolmnurk k2=new Kolmnurk(2, 4, 7, 2, 1, 6);
		k1.tryki();
		k2.tryki();	
		System.out.println(k1.ymbermoot());
		System.out.println(k2.ymbermoot());		
	}
}
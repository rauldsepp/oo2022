public class Proov1{
	public static void main(String[] arg){
		Mangija m1=new Mangija("Raudsepp", 7, 12, 30, 3.5);
		Mangija m2=new Mangija("Tamm", 3, 3, 37, 2.0);
		Mangija m3=new Mangija("Lepp", 1, 1, 35, 3.0);
		Mangija m4=new Mangija("Sepp", 10, 10, 10, 2.5);
		Mangija m5=new Mangija("Maasikas", 4, 1, 9, 2.7);
		System.out.println(m1);
		System.out.println(m1.kaugus(10,12));
		m1.liigu(1);
		System.out.println(m1);
		
	}
}
public class Proov2{
	public static void main(String[] arg){
		Meeskond mk1=new Meeskond("FC Karud");
		Mangija m1=new Mangija("Raudsepp", 7, 12, 30, 3.5);
		Mangija m2=new Mangija("Tamm", 17, 12, 150, 3.5);
		mk1.lisaMangija(m1);
		mk1.lisaMangija(m2);		
		System.out.println(mk1);
		System.out.println(mk1.lahim(5,20));
		mk1.liigu(3);
		System.out.println(mk1);
		System.out.println(mk1.lahim(5,20));
	}
}
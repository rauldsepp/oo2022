public class Proov2a{
	public static void main(String[] arg){
		String juhis="kee";
		Kilpkonn k1=new Kilpkonn();
		if(juhis.substring(0,1).equals('e')){k1.edasi();}
		else{k1.keera();}
		System.out.println(k1);
		if(juhis.charAt(1)=='e'){k1.edasi();}
		else{k1.keera();}
		System.out.println(k1);
		if(juhis.charAt(2)=='e'){k1.edasi();}
		else{k1.keera();}
		System.out.println(k1);
	}
}
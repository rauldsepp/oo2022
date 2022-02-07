public class Funktsioonid3{

	public static double akeskmine(double[] arvud){
		if(arvud.length==0){
			throw new RuntimeException("pole arve");
		}
		double summa=0;
		for(int i=0; i<arvud.length; i++){
			summa+=arvud[i];
		}
		return summa/arvud.length;
	}
	public static double[] reaalarvudeks(String[] sd){
		double[] v=new double[sd.length];
		for(int i=0; i<sd.length; i++){
			v[i]=Double.parseDouble(sd[i]);
		}
		return v;
	}

	public static void main(String[] args){
		double[] arvud=reaalarvudeks(args);
		double kesk=akeskmine(arvud);
		double abi=0;
		for(int i=0;i<arvud.length; i++){
			double vahe=arvud[i]-kesk;
			abi+=vahe*vahe;
		}
		System.out.println(Math.sqrt(abi/arvud.length));
	}
}
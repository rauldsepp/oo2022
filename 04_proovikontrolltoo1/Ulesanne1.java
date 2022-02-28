public class Ulesanne1{

	public static double keskmine(double a, double b, double c){
		return (a+b+c)/3.0;
	}
	
	public static double[] libisev(double[] arvud){
		double[] v=new double[arvud.length-2];
		for(int i=0; i<v.length; i++){
			v[i]=keskmine(arvud[i], arvud[i+1], arvud[i+2]);
		}
		return v;
	}
	
	public static void main(String[] args){
		System.out.println(keskmine(1, 3, 5));
		double[] sisend={1, 3, 5, 4};
		double[] vastus=libisev(sisend);
		for(int i=0; i<vastus.length; i++){
			System.out.println(vastus[i]);
		}
	}
}
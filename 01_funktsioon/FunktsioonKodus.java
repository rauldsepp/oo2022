public class FunktsioonKodus {
	
	public static double celsiuseks(double fahrenheit){
		return (fahrenheit-32)*5/9;
	}
	public static double fahrenheidiks(double celsius){
		return celsius*9/5+32;
	}
	public static void main(String[] args){
		if(args.length>0){
			double t=Double.parseDouble(args[0]);
			System.out.println(celsiuseks(t));
		}
	}
}
public class Mang{
	double number;
	public Mang(double uusNumber){
		number=uusNumber;
	}
	public String toString(){
		int min = 1;  
		int max = 3;  
		number = Math.floor(Math.random()*(max-min+1)+min);
		return "Number: "+number;
	}
}
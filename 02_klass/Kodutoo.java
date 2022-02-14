import java.util.Random;

public class Kodutoo{
	private static Random generaator=new Random();
	
	private int kulgedeNumber;
	
	public Kodutoo(int uusNumber){kulgedeNumber=uusNumber;}
	 
	public int veereta(){
		int kulg = generaator.nextInt(kulgedeNumber);
		return kulg + 1;
	}
}
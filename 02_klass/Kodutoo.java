import java.util.Random;

public class Kodutoo{
	private static Random generator=new Random();
	
	private int numberOfSides;
	
	public Kodutoo(int newNumber){numberOfSides=newNumber;}
	 
	public int roll(){
		int randomValue = generator.nextInt(numberOfSides);
		return randomValue + 1;
	}
}
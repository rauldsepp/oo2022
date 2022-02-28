import java.io.*;
public class Kirjutamine1{
	public static void main(String[] arg) throws IOException{
		PrintWriter pw1=new PrintWriter(new FileWriter("valjund1.txt"));
		pw1.println("Jou, mees!");
		pw1.println("Kõva.");
		pw1.close();
	}
}
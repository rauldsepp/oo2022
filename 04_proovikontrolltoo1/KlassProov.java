import java.util.*;
public class KlassProov{
	public static void main(String[] arg){
		Klass k=new Klass();
		k.lisa(1);
		k.lisa(2);
		k.lisa(3);
		k.lisa(1);
		k.lisa(2);
		System.out.println(Arrays.toString(k.libisevKeskmine()));
	}
}
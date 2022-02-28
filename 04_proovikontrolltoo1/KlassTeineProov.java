import java.util.*;
public class KlassTeineProov{
	public static void main(String[] arg){
		KlassTeine k=new KlassTeine();
		k.lisa(1);
		k.lisa(2);
		k.lisa(3);
		k.lisa(1);
		k.lisa(2);
		System.out.println(k.libisevKeskmine());
	}
}
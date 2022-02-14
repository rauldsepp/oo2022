import java.util.*;  
public class Proov3{
	public static void main(String[] arg){
		int[][] laud=new int[10][10];
		Scanner sc=new Scanner(System.in); 
		String juhis=sc.nextLine();
		if(arg.length>0){juhis=arg[0];}
		Kilpkonn k1=new Kilpkonn();
		for(int i=0; i<juhis.length(); i++){
			if(juhis.charAt(i)=='e'){k1.edasi();}
			else {k1.keera();}
			laud[k1.kysiX()][k1.kysiY()]=1;
		}
		for(int i=0;i<10; i++){
			for(int j=0;j<10;j++){
				System.out.print(laud[i][j]);
			}
			System.out.println();
		}		
	}
}
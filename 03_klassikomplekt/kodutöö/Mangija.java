public class Mangija{
	String nimi;
	static int raha;
	int panus;
	public Mangija(String uusNimi, int uusRaha, int uusPanus){
		panus=uusPanus;
		nimi=uusNimi;
		raha=uusRaha;
	}
	public String toString(){
		return nimi+" raha: "+raha+" panus: "+panus;
	}
	public static int panusta(int panus){
		raha -= panus;
		return raha;
	}
}
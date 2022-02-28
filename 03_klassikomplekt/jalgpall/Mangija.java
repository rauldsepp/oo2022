public class Mangija{
	String perekonnanimi;
	double x, y, nurkRad, kiirus;
	public Mangija(String uusPerekonnanimi, double uusX, double uusY, double uusNurkKraadides, double uusKiirus){
		perekonnanimi=uusPerekonnanimi; x=uusX; y=uusY;
		nurkRad=Math.toRadians(uusNurkKraadides);
		kiirus=uusKiirus;
	}
	public String toString(){
		return perekonnanimi+" ("+Math.round(x)+", "+Math.round(y)+") "+Math.round(Math.toDegrees(nurkRad))+" kraadi "+kiirus+ " m/s";
	}
	public void liigu(double sek){
		//dx = sek * m/s * Math.cos(nurk)
		//dy = sek * m/s * Math.sin(nurk)
		x += sek * kiirus * Math.cos(nurkRad);
		y += sek * kiirus * Math.sin(nurkRad);
	}
	public double kaugus(double ux, double uy){
		double dx=ux-x; double dy=uy-y;
		return Math.sqrt(dx*dx+dy*dy);
	}
}

//Koosta prooviprogramm mängijaga
package Joogid;

public class Joogipudel{
    double maht, mass, taara;
    String pudelityyp;
    public Jook j;


    public Joogipudel(double maht, double mass, double taara, String pudelityyp, Jook uusJook){
        this.pudelityyp=pudelityyp;
        this.maht=maht;
        this.taara=taara;
        this.mass=mass;
        j=uusJook;
    }
    public double mass(){
        return mass+(maht*j.erikaal);
    }

    public double hind(){
        return maht*j.liitri_hind;
    }
}
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
    public void mass(){
        System.out.println("mass: "+(mass+(maht*j.erikaal)));
    }

    public void hind(){
        System.out.println("hind: "+maht*j.liitri_hind);
    }
}
public class Joogivaat{
    double ruumala, kogus;
    public Joogipudel p;

    public Joogivaat(double ruumala, double kogus, Joogipudel uusPudel){
        this.ruumala=ruumala;
        this.kogus=kogus;
        p=uusPudel;
    }

    public void taida(){
        kogus-=p.maht;
        if(kogus <= 0){
            System.out.println("Otsas");
        } else {
            System.out.println(kogus);
        }
    }
}
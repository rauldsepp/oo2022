class Risttahukas extends Kujund{
    double pikkus, laius;
    public Risttahukas(double uus_p, double uus_l, double uus_k){
        korgus=uus_k;
        pikkus=uus_p;
        laius=uus_l;  
    }
    @Override
    public double pohjaYmbermoot(){
        return 2*(pikkus+laius);
    }

}
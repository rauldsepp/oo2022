class Silinder extends Kujund{
    double raadius;
    public Silinder(double uus_r, double uus_k){
        korgus=uus_k;
        raadius=uus_r;  
    }
    @Override
    public double pohjaYmbermoot(){
        return 2*Math.PI*raadius;
    }

}
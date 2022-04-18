class Eesti extends Riik{
    long rahvaarv, pindala;
    
    public Eesti(long uus_r, long uus_p, double uus_l){
        rahvaarv=uus_r;
        pindala=uus_p;
        linna_asustus=uus_l;
    }
    @Override
    public double asustustihedus(){
        return rahvaarv/pindala;
    }
}
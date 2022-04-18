public abstract class Riik{
    double linna_asustus;

    public abstract double asustustihedus();

    public double linnad(){
        return linna_asustus-asustustihedus();
    }
}
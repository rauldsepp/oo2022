public class Murrud {

    public double summa;
    public double segaarv;

    public double liida(double esimene, double teine, double kolmas, double neljas){
        esimene *= neljas;
        kolmas *= teine;
        summa = esimene + kolmas;
        return summa;
	}

    public double segaarv(double lugeja, double nimetaja){
            segaarv = Math.floor(lugeja/nimetaja);
            segaarv = Math.round(segaarv);
            return segaarv;   
    }

    public static double uhine(double a, double b) {
        return b == 0 ? a : uhine(b, a % b);
    }

    public static String murruna(double a, double b) {
        double uhine = uhine(a, b);
        return Math.round(a / uhine) + "/" + Math.round(b / uhine);
    }

}
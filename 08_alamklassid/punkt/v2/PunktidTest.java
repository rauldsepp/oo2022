class PunktidTest{
    public static void main(String[] argumendid){
        int pArv=3;
        Punkt2D pd[] = new Punkt2D[pArv];
        pd[0]=new Punkt2D(2, 1);
        pd[1]=new Punkt3D(1, 0, 10);
        pd[2]=new Punkt2D(5, 5);

        double arv = 0;
        int uusNr = 0;
        for(int nr=0; nr<pArv; nr++){
            double suurim = pd[nr].kaugusNullist();            
            if(suurim > arv){
                arv = suurim;
                uusNr = nr;
            }
        }
        System.out.println(pd[uusNr]);
    }
}
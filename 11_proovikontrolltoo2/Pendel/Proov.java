public class Proov{
    public static void main(String[] arg){
        Pendel p1=new Pendel(25);
        Hammasratas h1=new Hammasratas(20, 10, "esimene");
        Hammasratas h2=new Hammasratas(30, 10, "teine");
        p1.maaraLykatav(h1);
        h1.maaraLykatav(h2);

        new Thread(p1).start();
    }   
}
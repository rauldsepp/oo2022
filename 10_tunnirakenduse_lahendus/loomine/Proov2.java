public class Proov2{
    public static void main(String[] arg){
        PaarideLoender<Integer> p1=new PaarideLoender<>();
        p1.lisa(3);
        p1.lisa(2);
        p1.lisa(3);
        p1.lisa(2);
        System.out.println(p1.loendur);

        
    }
}
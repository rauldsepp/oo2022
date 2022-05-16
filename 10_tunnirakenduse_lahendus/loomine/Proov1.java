public class Proov1{
    public static void main(String[] arg){
        SamaTyypiPaar<Integer> asukoht=new SamaTyypiPaar<>();
        asukoht.esimene=7;
        asukoht.teine=4;
        System.out.println(asukoht.esimene);
        System.out.println(asukoht);

        SamaTyypiPaar<String> inimene=new SamaTyypiPaar<>();
        inimene.esimene="Anti";
        inimene.teine="Nuga";
        System.out.println(inimene.esimene);
        System.out.println(inimene);
    }
}
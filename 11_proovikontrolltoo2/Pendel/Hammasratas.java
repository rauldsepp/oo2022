public class Hammasratas implements Lykatav{
    int valishambaid, mitmesvaline, sisehambad, mitmessisemine;
    String nimetus;
    Lykatav lt;
    public Hammasratas(int valishambaid, int sisehambad, String nimetus){
        this.valishambaid=valishambaid;
        this.sisehambad=sisehambad;
        this.nimetus=nimetus;
    }
    public void maaraLykatav(Lykatav uus){
        lt=uus;
    }
    public void lykka(){
        mitmesvaline++;
        if(mitmesvaline*1.0/valishambaid>=mitmessisemine*1.0/sisehambad){
            mitmessisemine++;
            if(lt!=null){lt.lykka();}
        }
        if(mitmesvaline==valishambaid){
            System.out.println("ring"+nimetus);
            mitmesvaline=0;
            mitmessisemine=0;
        }
    }
}
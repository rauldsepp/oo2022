public class Proov1{
    public static void main(String[] arg){
        Logija prooviLogija=new FailiLogija("teated.txt");
        //Logija prooviLogija=new LihtneLogija();
        prooviLogija.logi("algus");
        if(arg.length==2){
            System.out.println(Integer.parseInt(arg[0])*Integer.parseInt(arg[1]));
        }
        prooviLogija.logi("ots");
    }
}
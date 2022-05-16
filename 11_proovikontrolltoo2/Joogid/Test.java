public class Test{
    public static void main(String[] arg){
        Jook j1=new Jook("piim", 0.9, 1.03);
        
        Joogipudel jp1=new Joogipudel(1, 0.025, 0.10, "plastik", j1);
        Joogipudel jp2=new Joogipudel(1, 0.025, 0.10, "plastik", j1);
        Joogipudel jp3=new Joogipudel(1, 0.025, 0.10, "plastik", j1);
        Joogipudel jp4=new Joogipudel(1, 0.025, 0.10, "plastik", j1);

        Joogivaat jv1=new Joogivaat(10, 2.5, jp1);
        jp1.mass();
        jp1.hind();
        jv1.taida();

    }
}
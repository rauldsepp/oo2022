package pr1;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static int korrutaKahega(int arv){
        return arv*2;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

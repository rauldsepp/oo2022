import java.util.*;
public class Proov2{
    public static void main(String[] arg){
        Map<Integer, String> valvajad=new HashMap<>();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(1, "Mati");
        System.out.println(valvajad);

        Map<String, Integer> eesnimed=new HashMap<>();
        eesnimed.put("Jaanus", 4);
        eesnimed.put("Karl", 3);
        eesnimed.put("Albert", 5);
        System.out.println(eesnimed);
        for(String voti : eesnimed.keySet()){
            System.out.println(voti);
        }
        System.out.println(eesnimed.keySet());
    }
}
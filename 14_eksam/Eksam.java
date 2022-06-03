public class Eksam{
    private String sona;
    private int position;
    
    public Eksam(String uusSona){sona=uusSona;}

    public boolean onVokaal(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'õ' || c == 'ä' || c == 'ö' || c == 'ü') {
            return true;
        } else {
            return false;
        }
    }

    public int mituSilpi() {
        int loendur = 0;
        sona = sona.toLowerCase();
        
        boolean taishaalik = false;
        for (int j = 0; j < sona.length(); j++) {
            if (sona.contains("a") || sona.contains("e") || sona.contains("i") || sona.contains("o") || sona.contains("u") || sona.contains("õ") || sona.contains("ä") || sona.contains("ö") || sona.contains("ü")) {
                if (onVokaal(sona.charAt(j))) {
                    if (taishaalik == false) {
                        loendur++;
                        taishaalik = true;
                    }
                } else {
                    taishaalik = false;
                }
            } else {
                loendur++;
                break;
            }
        }
        return loendur;
    }

    public String toString(){
		return "Sõnas "+sona+" on "+mituSilpi()+" silpi.";
	}
}
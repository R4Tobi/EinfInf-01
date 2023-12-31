package MathInf;

public class DecimalToDual {
    public static String transformDual(int dec){
        if (dec == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        //Teilen von dec durch 2 bis es nicht mehr geht
        while (dec > 0) {
            int remainder = dec % 2; //rest kann nur 1 oder 0 sein
            binary.insert(0, remainder); //rest der division in den String integrieren
            dec /= 2; //division ausführen für den nächsten durchlauf
        }

        return binary.toString();
    }

    public static void main(String[] args){
        System.out.println(transformDual(13));
    }
}

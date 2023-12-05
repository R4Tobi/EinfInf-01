package OOP;

import java.util.Arrays;
import java.util.Objects;

public class GluehWein implements Comparable<GluehWein>{
    final String[] TASTE = {"rot", "weiß", "eierlikör"};
    final float[] PRICE = {3.5F, 4.0F, 5.0F};
    final float[] AMOUNT = {0.25F, 0.5F};
    private static int counter = 0;
    private boolean shot;
    private String taste;
    private float amount;

    public GluehWein(boolean shot, float amount, String taste){
        this.shot = shot;

        boolean isTaste = false;
        for (String t : this.TASTE) {
            if (t.equals(taste)) {
                isTaste = true;
                break;
            }
        }

        boolean isAmount = false;
        for (float a: this.AMOUNT) {
            if (a == amount) {
                isAmount = true;
                break;
            }
        }
        if(!isTaste){
            System.err.println("not a valid taste. Use " + Arrays.toString(TASTE));
            return;
        }
        if(!isAmount){
            System.err.println("not a valid amount. Use " + Arrays.toString(AMOUNT));
            return;
        }

        this.amount = amount;
        this.taste = taste;
        counter++;
    }

    public float getPrice(){
        float price = 0;
        if(this.amount == 0.5F){
            price += 3.0F;
        }
        if(shot){
            price += 2.0F;
        }
        for (int i = 0; i < this.TASTE.length; i++) {
            if(Objects.equals(TASTE[i], taste)){
                price += this.PRICE[i];
            }
        }
        return price;
    }

    public static int getCounter(){
        return counter;
    }
    @Override
    public int compareTo(GluehWein G1){
        return Float.compare(G1.getPrice(), this.getPrice());
    }
    @Override
    public String toString(){
        return "Geschmack: " + this.taste + " Schuss: " + this.shot + " Menge: " + this.amount;
    }
}

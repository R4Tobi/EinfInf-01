package MathInf;

import java.util.Arrays;

public class Food implements Comparable<Food> {

    private static final String[] TYPES = {"Apple", "Pear", "Cookie", "Grape"};

    private String type;
    private int calories;

    public Food(String type, int calories) {
        boolean isTypeOf = false;
        for(String typeStr : TYPES){
            if (typeStr.equals(type)) {
                isTypeOf = true;
                break;
            }
        }
        if(!isTypeOf){
            System.err.println("Wrong type.");
        }else{
            this.type = type;
            this.calories = calories;
        }

    }
    @Override
    public String toString(){
        return "Type: " + this.type + ", Calories: " + this.calories;
    }
    @Override
    public int compareTo(Food o) {
        return Integer.compare(this.calories * this.type.length(), o.calories * o.type.length());
    }

    public String getType() {
        return this.type;

    }

    public int getCalories() {
        return this.calories;
    }

    public static Food[] createSortedRandomList(int n) {
        Food[] f = new Food[n];
        for(int i = 0; i < n; i++){
            int x = (int) (Math.random() * 4);
            int y;
            switch(TYPES[x]){
                case "Apple" -> y = 52;
                case "Pear" -> y = 57;
                case "Grape" -> y = 67;
                case "Cookie" -> y = 353;
                default -> y = 0;
            }
            f[i] =new Food(TYPES[x],y);
        }

        Arrays.sort(f);
        return f;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createSortedRandomList(5)));
        int result = new Food("Apple", 123).compareTo(new Food("Cookie", 253));
        System.out.println(result);
    }

}

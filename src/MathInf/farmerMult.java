package MathInf;

public class farmerMult {
    public static int farmerMultRec(int x, int y){
        if(x == 1){
            return y;
        } else if (x % 2 != 0) {
            return farmerMultRec(x/2, y*2);
        }
        return farmerMultRec(x/2, y*2);
    }

    public static void main(String[] args){
        System.out.println(farmerMultRec(200,150));
    }
}

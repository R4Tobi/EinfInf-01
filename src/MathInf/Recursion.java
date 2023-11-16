package MathInf;

public class Recursion {
    public static int h(int x){
        if(x % 2== 0){
            return x/2;
        }else{
            return h(3*x+1);
        }
    }

    public static int g(int x){// terminiert nicht bei Zahlen kleiner als 1
        if(x==1){
            return x;
        }else{
            System.out.println(x);
            return g(h(x));
        }
    }

    public static void main(String[] args){
        System.out.println(g(22));
        //System.out.println(h(5));
    }
}

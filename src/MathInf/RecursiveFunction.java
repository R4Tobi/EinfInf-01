package MathInf;

public class RecursiveFunction {
    public static void main(String[] args){
        //System.out.println(f(-4, 2));
        System.out.println(rec(366, 35));
        System.out.println(rec(-454, -88));
        System.out.println(rec(456, -56));
        System.out.println(rec(-56, 984));
    }



    //Terminiert nicht, wenn y negativ ist, der Basisfall wird nie erreicht. (StackOverflow)
    //x = 6, y = 5, return = 1,  6-5=1
    //x = 2, y = 2, return = 0,  2-2=0
    //x =-4, y = 2, return =-6, -4-2=6
    //x = 5, y =-1, StackOverflow
    public static int f(int x, int y){
        if(y == 0){
            return x;
        }else{
            return f(x - 1, y - 1);
        }
    }

    //Terminiert bei jeder ganzen Zahl für y
    //x = 6, y = 5, return = 1,  6-5=1
    //x = 2, y = 2, return = 0,  2-2=0
    //x =-4, y = 2, return =-6, -4-2=6
    //x = 5, y =-1, return = 6, 5--1=6
    public static int rec(int x, int y){
        if(y == 0){
            return x;
        }
        else if(y < 0 && x < 0 || y < 0 && x > 0){
            return rec(x + 1, y + 1);
        }else{
            return rec(x - 1, y - 1);
        }
    }

    public static int iter(int x, int y){
        while(y != 0){
            if(y < 0 && x < 0){
                x++;
                y++;
            }else if(y < 0 && x > 0) {
                x++;
                y++;
            }else{
                x--;
                y--;
            }
        }
        return x;
    }
}

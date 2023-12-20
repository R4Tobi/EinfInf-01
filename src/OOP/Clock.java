package OOP;

import java.util.Arrays;

public class Clock implements Comparable<Clock>{
    int minute;
    int hour;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        convertTime();
    }

    public Clock(String time) {
        String[] timeArr = time.split(":");
        try{
            this.hour = Integer.parseInt(timeArr[0]);
            this.minute = Integer.parseInt(timeArr[1]);
            convertTime();
        }catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.err.println("Cannot convert from String: " + time);
        }
    }

    public int getMin(){
        return this.minute;
    }

    public int getH(){
        return this.hour;
    }

    public void convertTime(){
        while(this.minute > 59){
            this.hour++;
            this.minute -= 60;
        }
        while(this.hour > 23){
            this.hour -= 24;
        }
    }
    public Clock add(int min){
        this.minute += min;
        convertTime();
        return new Clock(this.hour, this.minute);
    }

    public Clock add(Clock c){
        this.minute += c.minute;
        this.hour += c.hour;
        convertTime();
        return new Clock(this.hour, this.minute);
    }

    @Override
    public String toString() {
        String hour = "" + this.hour;
        String minute = "" + this.minute;

        while(hour.length() < 2){
            hour = "0" + hour;
        }
        while(minute.length() < 2){
            minute = "0" + minute;
        }

        return hour + ":" + minute;
    }

    @Override
    public int compareTo(Clock c) {
        return Double.compare(this.getH() + (double) this.getMin() /60, c.getH() + (double) c.getMin() /60);
    }


    public static void main(String[] args) {
        Clock c1 = new Clock(12, 34);
        Clock c2 = new Clock(13, 56);
        Clock c3 = new Clock(12, 41);
        Clock c4 = new Clock(11, 43);
        Clock c5 = new Clock(15, 23);
        Clock c6 = new Clock(10, 18);

        Clock[] cArr = new Clock[]{c1,c2,c3,c4,c5,c6};
        System.out.println(Arrays.toString(cArr));
        Algorithms.QuickSort.quickSort(cArr);
        System.out.println(Arrays.toString(cArr));
    }
}

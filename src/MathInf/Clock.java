package MathInf;

public class Clock {
    int minute;
    int hour;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Clock(String time) {
        String[] timeArr = time.split(":");
        try{
            this.hour = Integer.parseInt(timeArr[0]);
            this.minute = Integer.parseInt(timeArr[1]);
            convertTime();
        }catch(NumberFormatException e){
            System.err.println("Cannot convert to Int: " + time);
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

    public static void main(String[] args) {
        System.out.println(new Clock(12, 59).add(12)); // 13:11
        System.out.println(new Clock(0, 0).add(24*60 + 61)); //01:01
        System.out.println(new Clock(0,0).add(new Clock(25, 312))); //06:12
        System.out.println(new Clock("12:34").add(new Clock("00:00"))); //12:40
        System.out.println(new Clock("12:oi").add(new Clock("00:00"))); //cannot convert to int
    }
}

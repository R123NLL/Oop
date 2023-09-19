package oop.Clock;

public class Clock {
    private int hours, minutes, seconds;

    public int getHours() {
        return hours;
    }

    public boolean setHours(int hours) {
        if (hours < 0 || hours > 23) {
            this.hours = 0;
            return false;
        } else {
            this.hours = hours;
            return true;
        }
    }

    public int getMinutes() {
        return minutes;
    }


    public boolean setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            this.minutes = 0;
            return false;
        } else {
            this.minutes = minutes;
            return true;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            this.seconds = 0;
            return false;
        } else {
            this.seconds = seconds;
            return true;
        }
    }

    public void tick() {
        seconds++;
        minutes += seconds / 60;
        hours += minutes / 60;
        seconds %= 60;
        minutes %= 60;
        hours %= 24;
    }

    public void show() {
        if (hours < 10)
            System.out.print("0");
        System.out.print(hours + ":");
        if (minutes < 10)
            System.out.print("0");
        System.out.print(minutes + ":");
        if (seconds < 10)
            System.out.print("0");
        System.out.print(seconds);
    }

    public void reset(){
        this.hours=0;
        this.minutes=0;
        this.seconds=0;
    }
}

package oop;

public class Time {
    private int hours;
    private int minutes;
    private int sum;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void tick() {
        this.sum = (hours * 60) + minutes;
        if (sum > 0) {
            this.sum--;
            this.hours = sum / 60;
            this.minutes = sum % 60;
            System.out.printf("%d:%02d %n", this.hours, this.minutes);
        } else {
            System.out.println("The washing machine is finished");
        }
    }
}
package oop.Clock;

public class TestClock {
    public static void main(String[] args) {
        Clock c1 = new Clock();

        c1.setHours(11);
        c1.setMinutes(46);
        c1.setSeconds(30);

        c1.show();
        System.out.println();
        c1.tick();
        c1.tick();
        c1.show();
        System.out.println();
        c1.reset();
        c1.show();
        System.out.println();
    }
    }

package ge.itvet;

import ge.itvet.datetime.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = new Calendar(1, 2021);
        System.out.println(calendar.daysBetween(new Calendar(31,2021)));


    }
}

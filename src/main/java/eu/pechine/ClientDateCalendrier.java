package eu.pechine;

import java.util.Arrays;

public class ClientDateCalendrier {
    public static void main(String[] args) {
        DateCalendrier dateCalendrier1 = new DateCalendrier();
        DateCalendrier dateCalendrier2 = new DateCalendrier(22,06,2006);
        System.out.println(dateCalendrier1.toString());
        System.out.println(dateCalendrier2.toString());

    }
}

package eu.pechine;

public class ClientReservation {
    public static void main(String[] args) {
        DateCalendrier date1 = new DateCalendrier(6,2,2025);
        Horaire horaire1 = new Horaire(14,0);
        Horaire horaire2 = new Horaire(15,30);
        PlageHoraire plageHoraire1 = new PlageHoraire(horaire1, horaire2);
        Reservation reservation1 = new Reservation(date1,plageHoraire1,"cours d'anglais");
        DateCalendrier date2 = new DateCalendrier(6,2,2025);
        Horaire horaire3 = new Horaire(15,45);
        Horaire horaire4 = new Horaire(17,30);
        PlageHoraire plageHoraire2 = new PlageHoraire(horaire3, horaire4);
        Reservation reservation2 = new Reservation(date2,plageHoraire2,"cours de math");
        System.out.println(reservation1.getReservation());
        System.out.println(reservation2.getReservation());
        System.out.println(reservation1.compareTo(reservation2));
        System.out.println(reservation2.compareTo(reservation2));
    }
}

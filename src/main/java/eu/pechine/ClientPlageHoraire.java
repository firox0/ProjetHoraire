package eu.pechine;

public class ClientPlageHoraire {
    public static void main(String[] args) {
        Horaire horaire1 = new Horaire(23, 45);
        Horaire horaire2 = new Horaire(20, 30);
        Horaire horaire3 = new Horaire(18, 15);
        Horaire horaire4 = new Horaire(12, 30);
        PlageHoraire plageHoraire1 = new PlageHoraire(horaire2, horaire1);
        PlageHoraire plageHoraire2 = new PlageHoraire(horaire4, horaire3);
        System.out.println(plageHoraire1.toString());
        System.out.println(plageHoraire2.toString());
        System.out.println(plageHoraire1.compareTo(plageHoraire2));
        System.out.println(plageHoraire2.toString());
        System.out.println(plageHoraire1.toString());
        System.out.println(plageHoraire2.compareTo(plageHoraire1));
        PlageHoraire plageHoraire3 = new PlageHoraire(horaire4, horaire1);
        PlageHoraire plageHoraire4 = new PlageHoraire(horaire3, horaire2);
        System.out.println(plageHoraire3.toString());
        System.out.println(plageHoraire4.toString());
        System.out.println(plageHoraire3.compareTo(plageHoraire4));
        System.out.println(plageHoraire3.toString());
        System.out.println(plageHoraire1.toString());
        System.out.println(plageHoraire3.compareTo(plageHoraire1));

    }
}

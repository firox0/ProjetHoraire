package eu.pechine;

public class Main {
    public static void main(String[] args) {
        Horaire horaire1 = new Horaire(23,45);

        System.out.println(horaire1.toString());
        System.out.println(horaire1.getHeure());
        System.out.println(horaire1.getQuartHeure());
        System.out.println(horaire1.toMinutes());
        horaire1.setQuartHeure(15);
        horaire1.setHeure(10);
        System.out.println(horaire1.toString());
        System.out.println(horaire1.toMinutes());
    }
}
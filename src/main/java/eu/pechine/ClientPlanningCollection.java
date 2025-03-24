package eu.pechine;

public class ClientPlanningCollection implements ConstantesErreur {
    public static void main(String[] args) {
        PlanningCollection planningCollection = new PlanningCollection();

        DateCalendrier date1 = new DateCalendrier(15, 3, 2024);
        DateCalendrier date2 = new DateCalendrier(16, 3, 2024);
        DateCalendrier date3 = new DateCalendrier(18, 3, 2024);

        PlageHoraire plage1 = new PlageHoraire(new Horaire(10, 0), new Horaire(12, 0));
        PlageHoraire plage2 = new PlageHoraire(new Horaire(14, 0), new Horaire(16, 0));
        PlageHoraire plage3 = new PlageHoraire(new Horaire(11, 0), new Horaire(13, 0));

        Reservation reservation1 = new Reservation(date1,plage1,"python");
        Reservation reservation2 = new Reservation(date2,plage2,"math");
        Reservation reservation3 = new Reservation(date2,plage3,"Bd");

        try {
            planningCollection.ajout(reservation1);
            System.out.println("succes");
        } catch (ExceptionPlanning e) {
            System.out.println("Erreur" + messagesErreur[e.getCodeErreur()]);
        }

        try {
            planningCollection.ajout(reservation2);
            planningCollection.ajout(reservation3);
        } catch (ExceptionPlanning e) {
            System.out.println("Erreur" + messagesErreur[e.getCodeErreur()]);
        }

        System.out.println(planningCollection.toString());

        System.out.println(planningCollection.getSetReservation(date3));
        System.out.println(planningCollection.getSetReservation("python"));
    }

}

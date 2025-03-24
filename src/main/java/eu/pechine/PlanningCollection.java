package eu.pechine;

import java.util.*;


public class PlanningCollection {
    private List<Reservation> listReservation;
    private Set<Reservation> setReservation;
    private Map<Integer, List<Reservation>> resParSemaine;
    public PlanningCollection() {
        listReservation = new ArrayList<>();
        setReservation = new TreeSet<>();
        resParSemaine = new TreeMap<>();
    }

    public TreeSet<Reservation> getSetReservation(DateCalendrier date) {
        TreeSet<Reservation> treeSetReservation = new TreeSet<Reservation>();
        for (Reservation reservation : setReservation) {
            if (reservation.getDate().compareTo(date)==0) {
                treeSetReservation.add(reservation);
            }
        }
        return treeSetReservation;
    }

    public TreeSet<Reservation> getSetReservation(String string) {
        TreeSet<Reservation> treeSetReservation = new TreeSet<Reservation>();
        for (Reservation reservation : setReservation) {
            if (reservation.getIntitule().toLowerCase().contains(string.toLowerCase())) {
                treeSetReservation.add(reservation);
            }
        }
        return treeSetReservation;
    }

    public void ajout(Reservation reservation) throws ExceptionPlanning {
        System.out.println("ajout");
        Iterator<Reservation> iterateur = listReservation.iterator();
        while (iterateur.hasNext()) {
            Reservation r = iterateur.next();
            if (reservation.compareTo(r) == 0) {
                throw new ExceptionPlanning(2);
            }
        }
        listReservation.add(reservation);
        int sizeInitiale = setReservation.size();
        setReservation.add(reservation);
        if (sizeInitiale == setReservation.size()) {
            throw new ExceptionPlanning(2);
        }

        int semaine = reservation.getDate().getSemaine();
        if(!resParSemaine.containsKey(semaine)) {
            resParSemaine.put(semaine, new ArrayList<>());
        }
        resParSemaine.get(semaine).add(reservation);

    }


    @Override
    public String toString(){
        return "treeSet "+setReservation.size()+"- "+setReservation+ "\n"+"arrayList "+listReservation.size()+"- "+listReservation;
    }

}

package eu.pechine;

public class Planning {

    private  Reservation[] reservations;
    private final int nbReservations;

    public Planning(int nbReservations) {
        this.reservations = new Reservation[nbReservations];
        this.nbReservations = nbReservations;
    }

    public Reservation getReservation(Date pardate) {
        for (int i = 0; i < nbReservations; i++) {
            if (reservations[i].getDate().compareTo(pardate) == 0) {
                return reservations[i];
            }
        }
        return null;
    }

    public Reservation[] getReservations(Date pardate) {
        Reservation[] res = new Reservation[nbReservations];
        int compteur = 0;
        for (int i = 0; i < nbReservations; i++) {
            if (reservations[i].getDate().compareTo(pardate) == 0) {
                res[compteur] = reservations[i];
                compteur++;
            }
        }
        return res;
    }


    public int plusAncienneReservation(int parDebut, int parFin) {
        int ancienneI = parDebut;
        for (int i = parDebut; i < parFin; i++) {
            if (reservations[i].getDate().compareTo(reservations[ancienneI].getDate()) == -1) {
                ancienneI = i;
            }
        }
        return ancienneI;
    }



    public int getNbReservations() {
        return nbReservations;
    }

    public void ajout(Reservation reservation) throws ExceptionPlanning {
        if (!reservation.estValide()) {
            throw new ExceptionPlanning(0);
        }
        for (int i = 0; i < nbReservations; i++) {
            if (reservations[i]!=null && reservations[i].compareTo(reservation) == 0) {
                throw new ExceptionPlanning(2) ;
            }
        }
        for (int i = 0; i < nbReservations; i++) {
            if (reservations[i]==null) {
                reservations[i]=reservation;
                return ;
            }
        }
        throw new ExceptionPlanning(1) ;

    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < nbReservations; i++) {
            if (reservations[i]!=null) {
                res += "\n"+reservations[i].toString();
            }
        }
        return res;
    }
}
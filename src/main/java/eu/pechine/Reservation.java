package eu.pechine;


public class Reservation implements Comparable<Reservation>{
    private DateCalendrier date;
    private PlageHoraire plageHoraire;
    private String intitule;

    /**
     *
     * @param date
     * @param plageHoraire
     * @param intitule
     */
    public Reservation(DateCalendrier date, PlageHoraire plageHoraire, String intitule) {
        this.date = date;
        this.plageHoraire = plageHoraire;
        this.intitule = intitule;
    }

    public DateCalendrier getDate() {
        return date;
    }

    public void setDate(DateCalendrier date) {
        this.date = date;
    }

    public PlageHoraire getPlageHoraire() {
        return plageHoraire;
    }

    public void setPlageHoraire(PlageHoraire plageHoraire) {
        this.plageHoraire = plageHoraire;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int compareTo(Reservation reservation) {
        int ctdate = date.compareTo(reservation.date);
        int ctplage = plageHoraire.compareTo(reservation.plageHoraire);
        if (ctdate==0) {
            return ctplage;
        }
        return ctdate;
    }

    public boolean estValide() {
        return  (plageHoraire.estValide() && date.estValide());
    }

    public String getReservation() {
        return intitule +", "+ date.toString()+", "+ plageHoraire.toString()+", durée : "+plageHoraire.duree();
    }

    @Override
    public String toString() {
        return intitule;
    }
}

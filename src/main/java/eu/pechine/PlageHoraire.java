package eu.pechine;

public class PlageHoraire {

    public static final int MinimalDuration = 60;

    private Horaire start;
    private Horaire end;

    public PlageHoraire(Horaire start, Horaire end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return start + " - " + end;
    }

    public Horaire getEnd() {
        return end;
    }

    public Horaire getStart() {
        return start;
    }

    public int duree() {
        return start.toMinutes() - end.toMinutes();
    }

    public boolean estValide() {
        return end.toMinutes() - start.toMinutes() >= MinimalDuration;
    }

    public int compareTo(PlageHoraire plageHoraire) {

        if (this.end.toMinutes() <= plageHoraire.start.toMinutes()) {
            return -1;
        }
        else if (plageHoraire.end.toMinutes() <= this.start.toMinutes()) {
            return 1;
        }
        return 0;

    }

}
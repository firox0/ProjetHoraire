package eu.pechine;

public class Horaire {
    private int chHeure;
    private int chQuartHeure;

    public Horaire(int chHeure, int chQuartHeure) {
        this.chHeure = chHeure;
        this.chQuartHeure = chQuartHeure;
    }

    public int toMinutes() {
        return chHeure * 60 + chQuartHeure;
    }

    public int getHeure() {
        return chHeure;
    }

    public void setHeure(int chHeure) {
        this.chHeure = chHeure;
    }

    public int getQuartHeure() {
        return chQuartHeure;
    }

    public void setQuartHeure(int chQuartHeure) {
        this.chQuartHeure = chQuartHeure;
    }

    @Override
    public String toString() {
        return chHeure + "h" + (chQuartHeure == 0 ? "00" : chQuartHeure);
    }
}

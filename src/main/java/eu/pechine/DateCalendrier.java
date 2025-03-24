package eu.pechine;
import java.util.Calendar;

public class DateCalendrier extends Date implements ConstantesCalendrier {

    private int chJourSemaine;
    private int chSemaine;

    public DateCalendrier() {
        super();
        Calendar aujourdhui = Calendar.getInstance();
        int annee = aujourdhui.get(Calendar.YEAR);
        int mois = aujourdhui.get(Calendar.MONTH)+1;
        int jour = aujourdhui.get(Calendar.DAY_OF_MONTH);
        chSemaine = aujourdhui.get(Calendar.WEEK_OF_YEAR);
        setChJour(jour);
        setChMois(mois);
        setChAnnee(annee);
        int dayOfWeek = aujourdhui.get(Calendar.DAY_OF_WEEK);
        chJourSemaine=(dayOfWeek==1?7:dayOfWeek-1);

    }

    public int getSemaine() {
        return chSemaine;
    }

    public DateCalendrier(int jour, int mois, int annee) {
        super(jour,mois,annee);
        Calendar laDate = Calendar.getInstance();
        laDate.set(annee,mois-1,jour);
        int dayOfWeek = laDate.get(Calendar.DAY_OF_WEEK);
        chJourSemaine=(dayOfWeek==1?7:dayOfWeek-1);
        chSemaine = laDate.get(Calendar.WEEK_OF_YEAR);

    }

    public Date DateDuLendemain(Date date) {
        Date lendemain = super.dateDuLendemain(date);
        return new Date(lendemain.chJour,lendemain.chMois,lendemain.chAnnee);
    }

    public Date DateDeLaVeille(Date date) {
        Date veille = super.dateDeLaVeille(date);
        return new Date(veille.chJour,veille.chMois,veille.chAnnee);
    }

    @Override
    public String toString() {
        return (JOURS_SEMAINE[chJourSemaine-1]+" "+chJour+" "+MOIS[chMois-1]+" "+chAnnee);
    }

}

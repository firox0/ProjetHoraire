package eu.pechine;

import java.util.Scanner;

public class Date {
    public int chJour;
    public int chMois;
    public int chAnnee;

    public void setChJour(int chJour) {
        this.chJour = chJour;
    }

    public void setChMois(int chMois) {
        this.chMois = chMois;
    }

    public void setChAnnee(int chAnnee) {
        this.chAnnee = chAnnee;
    }

    public Date(){
    }


    public Date(int parJour, int parMois, int parAnnee) {
        chJour = parJour;
        chMois = parMois;
        chAnnee = parAnnee;
    }

    public Date(int parAnnee) {
        chAnnee = parAnnee;
        chMois = 1;
        chJour = 1;
    }

    public static Date lireDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre le jour:");
        int scJour = sc.nextInt();
        System.out.println("entre le mois:");
        int scMois = sc.nextInt();
        System.out.println("entre le annee:");
        int chAnnee = sc.nextInt();
        return new Date(scJour,scMois,chAnnee);
    }

    public boolean estValide() {
        if (chAnnee < 1583) {
            return false;
        }
        if (chMois > 12) {
            return false;
        }
        if (chJour > dernierJourMois(chMois,chAnnee)) {
            System.out.println("jour invalide"+chJour+";"+dernierJourMois(chMois,chAnnee));
            return false;
        }
        return true;
    }

    protected static int dernierJourMois(int parMois,int parAnnee) {
        switch (parMois) {
            case 2:
                return estBissextile(parAnnee) ?29:28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    protected static boolean estBissextile(int parAnnee) {
        return parAnnee%4==0;
    }

    public int compareTo(Date parDate) {
        if (chAnnee == parDate.chAnnee && chMois == parDate.chMois && chJour == parDate.chJour) {
            return 0;
        }
        if (chAnnee > parDate.chAnnee) {
            return 1;
        }
        if (chMois > parDate.chMois) {
            return 1;
        }
        if (chJour > parDate.chJour) {
            return 1;
        }
        return -1;
    }

    public Date dateDuLendemain(Date parDate) {
        int newJour = parDate.chJour+1;
        if (newJour>dernierJourMois(parDate.chMois,parDate.chAnnee)) {
            int newMois = parDate.chMois+1;
            if (newMois>12) {
                return new Date(1,1,parDate.chAnnee+1);
            }
            return new Date(1,newMois,parDate.chAnnee);
        }
        return new Date(newJour,parDate.chMois,parDate.chAnnee);
    }

    public Date dateDeLaVeille(Date parDate) {
        int newJour = parDate.chJour-1;
        if (newJour<1) {
            if (parDate.chMois-1<1) {
                return new Date(dernierJourMois(12,parDate.chAnnee-1),12,parDate.chAnnee-1);
            }
            return new Date(dernierJourMois(parDate.chMois-1,parDate.chAnnee),parDate.chMois-1,parDate.chAnnee);
        }
        return new Date(newJour,parDate.chMois,parDate.chAnnee);
    }

    @Override
    public String toString() {
        return chJour+"-"+chMois+"-"+chAnnee;
    }
}

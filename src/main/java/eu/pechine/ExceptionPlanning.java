package eu.pechine;

public class ExceptionPlanning extends Exception {
    private int codeErreur;
    public ExceptionPlanning(int codeErreur) {
        super();
        this.codeErreur = codeErreur;
    }

    public int getCodeErreur() {
        return codeErreur;
    }

}

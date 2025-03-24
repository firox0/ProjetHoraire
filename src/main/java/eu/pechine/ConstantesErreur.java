package eu.pechine;

public interface ConstantesErreur {
    final int reservationInvalide = 0;
    final int planningPlein = 1;
    final int resevationIncompatible = 2;

    final String[] messagesErreur = {
            "reservation non valide",
            "planning plein",
            "resevation incompatible",
    };
}

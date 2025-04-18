package co.edu.uniquindio.poo.model;

public enum Especialidad {
    ODONTOLOGIAGENERAL(0), ORTODONCIA(1), ENDODONCIA(2), CIRUGIAORAL(3);


    private final int valor;

    Especialidad(int valor) {
        this.valor = valor;
    }
}

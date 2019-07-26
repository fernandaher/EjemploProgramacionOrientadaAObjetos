package entidad;

public enum Mensajes {
    
    MENSAJES_PETICION_HORAS("Ingresa las horas trabajadas."),
    MENSAJES_PETICION_VALOR_HORA("Ingresa el valor por hora trabajada."),
    MENSAJES_SALARIO_PAGAR("Su salario es:");


    private String mensaje;

    Mensajes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}

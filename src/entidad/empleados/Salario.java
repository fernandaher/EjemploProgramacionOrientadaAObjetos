package entidad.empleados;


//Clase salario de el paquete salario, que está en el paquete entidad
public class Salario {
//definir variables
    private double horasTrabajadas;
    private double valorHora;
//get and set
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    //
    public double calcularSalario(){
        return (this.getHorasTrabajadas()* this.getValorHora());
    }
}

package main;

import static entidad.Mensajes.*;
import entidad.empleados.Salario;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args){


        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');
        DecimalFormat formateador = new DecimalFormat("###,###.##");
        Salario salario = new Salario();

        String horas = JOptionPane.showInputDialog(null,
                MENSAJES_PETICION_HORAS.getMensaje());

        String valor = JOptionPane.showInputDialog(null,
                MENSAJES_PETICION_VALOR_HORA.getMensaje());

        //El set se le entrega al ser el valor para que me lo traiga
        salario.setHorasTrabajadas(Double.parseDouble(horas));
        salario.setValorHora(Double.parseDouble(valor));


        JOptionPane.showMessageDialog(null,
                MENSAJES_SALARIO_PAGAR.getMensaje() + formateador.format(salario.calcularSalario()));

    }
}

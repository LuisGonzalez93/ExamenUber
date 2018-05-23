/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class UberSUV extends Vehiculo {

    private float precioViaje;
    private String tipoV = "UberSUV";

    public UberSUV(String matr, CategCoche tipocateg) {
        super(matr);
        if (tipocateg == CategCoche.LUJO) {
            //15€ Para vehiculos de lujo
            precioViaje = 15.00f;
        } else {
            //30€ Para vehiculos de lujo
            precioViaje = 30.00f;
        }
    }

    @Override
    public String getType() {
        return tipoV;
    }

    @Override
    public float calcularTarifa(int pasajeros, int kilometros) {
        //Pedimos al usuario que ingrese la potencia del vehículo
        float potencia = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la potencia del vehículo"));
        double precioPotencia = 0.5 * potencia;
        precioViaje += precioPotencia + (5 * kilometros);

        return precioViaje;
    }

}

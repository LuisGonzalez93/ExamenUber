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
public class UberX extends Vehiculo {

    private final int pasajerosAdmitidos = 4; //Se establece el tope de personas que puede albergar el vehículo
    private float precioViaje;  //Guardaremos aqui el precio del viaje 2€/km
    private String tipoV = "UberX";

    public UberX(String matr, TipoCoche tipoCoche) {
        super(matr);
        if (tipoCoche == TipoCoche.ELECTRICO) {
            //4€ Para vehiculos eléctricos
            precioViaje = 4.00f;
        } else {
            //6€ Para vehiculos no eléctricos
            precioViaje = 6.00f;
        }
    }

    @Override
    public String getType() {
        return tipoV;
    }

    @Override
    public float calcularTarifa(int pasajeros, int kilometros) {
        if (pasajeros > pasajerosAdmitidos) {
            JOptionPane.showMessageDialog(null, "UberX no puede albergar mas"
                    + " de " + pasajerosAdmitidos + " pasajeros");
        }
        precioViaje += 2 * kilometros;
        return precioViaje;
    }

    /*
    * Método que devuelve el número de pasajeros que admite el vehiculo
     */
    public int pasajerosAdmitidos() {
        return pasajerosAdmitidos;
    }
}

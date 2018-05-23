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
public class UberXL extends Vehiculo {

    private final int pasajerosAdmitidos = 7; //Se establece el tope de personas que puede albergar el vehículo
    private float precioViaje;//3€/Km
    private String tipoV = "UberXL";

    public UberXL(String matr, TipoCoche tipoCoche) {
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

    /*
    * Método que devuelve el número de pasajeros que admite el vehiculo
     */
    public int pasajerosAdmitidos() {
        return pasajerosAdmitidos;
    }

    @Override
    public float calcularTarifa(int pasajeros, int kilometros) {
        if (pasajeros > pasajerosAdmitidos) {
            JOptionPane.showMessageDialog(null, "UberXL no puede albergar mas"
                    + "de " + pasajerosAdmitidos + " pasajeros");
        }
        int precioPasajero = 1 * pasajeros; //1€ por pasajero
        precioViaje += precioPasajero + (3 * kilometros);//Sumamos el precio de numero de pasajeros mas el precio de 3€/Km
        return precioViaje;
    }

}

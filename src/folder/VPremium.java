/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author Alumno
 */
public interface VPremium {
    /**
     *
     * @param kilometros numero de kilómetros recorridos
     * @param nocupantes numero de pasajeros en el vehículo
     * @param potencia cantidad de potencia del vehículo
     * @return float con el presupuesto
     */
    public float calcularTarifa(int kilometros, int pasajeros);
    public float calcularTarifa(int kilometros, double potencia);
    
    
}

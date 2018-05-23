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
public interface VEconomicos {

    /**
     *
     * @param kilometros número de kilometros recorridos
     * @param pasajeros número de pasajeros en el vehículo
     * @return float con el presupuesto
     */
    public float calcularTarifa(int kilometros);
    public float calcularTarifa(int pasajeros,int kilometros);
}

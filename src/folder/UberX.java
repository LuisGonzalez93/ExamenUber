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
public class UberX extends Vehiculo implements VEconomicos{
    
    private final int pasajerosAdmitidos=4; //Se establece el tope de personas que puede albergar el vehículo
    private float precioViaje;  //Guardaremos aqui el precio del viaje 2€/km
    public UberX(String matr,TipoCoche tipoCoche) {
        super(matr);
        if(tipoCoche==TipoCoche.ELECTRICO){
            //4€ Para vehiculos eléctricos
        precioViaje=4.00f;
        }
        else{
            //6€ Para vehiculos no eléctricos
        precioViaje=6.00f;
        }
    }

    @Override
    public float calcularTarifa(int kilometros) {
        precioViaje+=2*kilometros;
        return precioViaje;
    }
    
    /*
    * Método que devuelve el número de pasajeros que admite el vehiculo
    */
    public int pasajerosAdmitidos(){
        return pasajerosAdmitidos;
    }

    @Override
    public float calcularTarifa(int pasajeros, int kilometros) {
        throw new UnsupportedOperationException("Deprecated for UberX. Must to be UberXL"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

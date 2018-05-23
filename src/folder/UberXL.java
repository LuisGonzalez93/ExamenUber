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
public class UberXL extends Vehiculo implements VEconomicos{
     private final int pasajerosAdmitidos=7; //Se establece el tope de personas que puede albergar el vehículo
     private float precioViaje;//3€/Km
    public UberXL(String matr,TipoCoche tipoCoche) {
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
    /*
    * Método que devuelve el número de pasajeros que admite el vehiculo
    */
    public int pasajerosAdmitidos(){
        return pasajerosAdmitidos;
    }
    
    @Override
    public float calcularTarifa(int kilometros) {
        throw new UnsupportedOperationException("Deprecated for UberXL. Must to be "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float calcularTarifa(int pasajeros, int kilometros) {
        int precioPasajero=1*pasajeros; //1€ por pasajero
        precioViaje+=precioPasajero+(3*kilometros);//Sumamos el precio de numero de pasajeros mas el precio de 3€/Km
        return precioViaje;
    }
    
}

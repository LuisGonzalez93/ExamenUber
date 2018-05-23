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
public class UberBlack extends Vehiculo implements VPremium{
    private float precioViaje;

    public UberBlack(String matr,CategCoche tipocateg) {
        super(matr);
        if(tipocateg==CategCoche.LUJO){
            //15€ Para vehiculos de lujo
        precioViaje=15.00f;
        }
        else{
            //30€ Para vehiculos de lujo
        precioViaje=30.00f;
        }
    }

    @Override
    public float calcularTarifa(int kilometros, int pasajeros) {
        float precioPasajeros=1*pasajeros;
        precioViaje+=precioPasajeros+(2*kilometros);
        
        return precioViaje;
    }

    @Override
    public float calcularTarifa(int kilometros, double potencia) {
        throw new UnsupportedOperationException("Deprecated for UberBlack. Must to be UberSUV"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

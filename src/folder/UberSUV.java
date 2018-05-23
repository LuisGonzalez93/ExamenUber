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
public class UberSUV extends Vehiculo implements VPremium{
    private float precioViaje;
    public UberSUV(String matr,CategCoche tipocateg) {
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
        throw new UnsupportedOperationException("Deprecated for UberSUV. Must to be UberBlack"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float calcularTarifa(int kilometros, double potencia) {
        double precioPotencia=0.5*potencia;
        precioViaje+=precioPotencia+(5*kilometros);
        
        return precioViaje;
    }

}

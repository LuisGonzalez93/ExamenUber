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
public class Vehiculo {
    
    //Todo vehículo debe albergar una matrícula
    private float tarifa;
    private String matricula;
    private String tipoV;
    public Vehiculo(String matr){
        this.matricula=matr;
    }
    public String getMatricula(){
        return matricula;
    }
    public float calcularTarifa(int pasajeros,int km){
        return tarifa;
    }
    public String getType(){
        return tipoV;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Uber {
    private ArrayList<Vehiculo> vehiculos_alta;
    private ArrayList<Vehiculo> vehiculos_baja;
    public Uber(){
    
    }
    //Ejercicio Apartado nº1
    public void darAltaVehiculo(Vehiculo vehiculo){
    vehiculos_alta.add(vehiculo);
    }
    //Ejercicio Apartado nº2
    public void altaOBajaTemporal(String matricula){
        Vehiculo vehiculo=null;
        boolean encontrado=false;
        for(int i=0;i<vehiculos_alta.size();i++){
            //Se busca al vehiculo con la matricula pasado por parámetro
            if(vehiculos_alta.get(i).getMatricula().equalsIgnoreCase(matricula)){
                //Si encuentra al vehiculo, lo guardamos en "vehiculo". Para mas
                //tarde decidir que hacer con el
                vehiculo=vehiculos_alta.get(i);
                encontrado=true;
                //Podríamos meter un break aqui para que la busqueda fuese mas
                //rápida y no tener que esperar a que recorra toda la lista
            }
        }
        //En el caso de que sea encontrado...
        if(encontrado){
            //Le damos al usuartio unas opciones a elegir
            String input=JOptionPane.showInputDialog(null,"¿Qué desea hacer?"
                    + "\n1.Dar de baja temporal el vehículo"
                    + "\n2.Dar de alta temporal el vehículo");
            switch(input){
                case "1":
                    //Se elimina de v_alta vehiculo y se añade en v_baja
                    vehiculos_alta.remove(vehiculo);
                    vehiculos_baja.add(vehiculo);
                    JOptionPane.showMessageDialog(null,"Vehiculo con matrícula "
                            + vehiculo.getMatricula()+" dado de baja correctamente");
                    break;
                case "2":
                    //Se elimina de v_baja vehiculo y se añade en v_alta
                    vehiculos_baja.remove(vehiculo);
                    vehiculos_alta.add(vehiculo);
                    JOptionPane.showMessageDialog(null,"Vehiculo con matrícula "
                            + vehiculo.getMatricula()+" dado de alta correctamente");
                    break;
            }
        }
    }
    //Ejercicio Apartado nº3
    public String vehiculosDisponibles(int npasajeros,int km){
        //Albergaremos aqui el precio maximo para ir comparando
        float precioMáximo;
        String show="";
        ArrayList<Vehiculo> listaAMostrar=new ArrayList<Vehiculo>();
        //Tenemos 8 posibles opciones
        //Las matriculas las pondremos vacías porque es algo que aquí no interesa
        listaAMostrar.add(new UberX("",TipoCoche.ELECTRICO));
        listaAMostrar.add(new UberX("",TipoCoche.NO_ELECTRICO));
        listaAMostrar.add(new UberXL("",TipoCoche.ELECTRICO));
        listaAMostrar.add(new UberXL("",TipoCoche.NO_ELECTRICO));
        listaAMostrar.add(new UberBlack("",CategCoche.LUJO));
        listaAMostrar.add(new UberBlack("",CategCoche.SUPERLUJO));
        listaAMostrar.add(new UberSUV("",CategCoche.LUJO));
        listaAMostrar.add(new UberSUV("",CategCoche.SUPERLUJO));
        
        //Comparamos los objetos en la lista y los ordenamos con...
        Collections.sort(listaAMostrar, (Vehiculo o1, Vehiculo o2) -> new Integer((int)o1.calcularTarifa(npasajeros,km)).compareTo((int)o2.calcularTarifa(npasajeros,km)));
        for(int i=0;i<listaAMostrar.size();i++){
            show+="\nVehiculo "+listaAMostrar.get(i).getType()+" "+listaAMostrar.get(i).calcularTarifa(npasajeros, km);
        }
        
        
    return show;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

import java.util.ArrayList;
import Entidades.Cliente;
import Entidades.Vehiculo;


/**
 *
 * @author valer
 */
public class VehiculoController {
    private ArrayList<Vehiculo> vehiculos = new Arraylist<>();
    
    //Se le pasa el ultimo elemento del arrayList clientes
    public void actualizar(Cliente cliente){
        vehiculos.add(cliente.getVehiculo());
    }
    
    public void actualizar(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void imprimir(){
        System.out.println("");
        for(Vehiculo v : vehiculos){
            v.imprimirEnFila();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

import Entidades.Mecanico;
import Entidades.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class MecanicoController {
    private ArrayList<Mecanico> mecanicos = new ArrayList<>();
    
    public ArrayList<Mecanico> getLista(){
        return this.mecanicos;
    }
    
    public void actualizar(){
        Mecanico mecanico = new Mecanico();
        mecanico.ingresarDatos();
        this.mecanicos.add(mecanico);
    }

    public void actualizarListaDelMecanico(Vehiculo vehiculo){
        Mecanico mecanico = this.busquedaxNombre(vehiculo);
        mecanico.getListaVehiculos().actualizar(vehiculo);
    }
    
    public Mecanico busquedaxNombre(Vehiculo vehiculo){
        for(Mecanico m : mecanicos){
            if(m.getNombre().equalsIgnoreCase(vehiculo.getMecanico())){
                return m;
            }
        }
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Administracion.MecanicoController;
import java.util.Scanner;

/**
 *
 * @author valer
 */
public class Cliente {
    private String nombre;
    private float montoPagado;
    private Vehiculo vehiculo;
    
    public Cliente(){
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setMonto(float montoPagado){
        this.montoPagado = montoPagado;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public float getMonto(){
        return this.montoPagado;
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    public void ingresarDatos(MecanicoController mecanicos){
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre: ");
        this.setNombre(input.nextLine());
        System.out.println("Valor pagado: ");
        this.setMonto(input.nextFloat());
        Vehiculo v = new Vehiculo(mecanicos);
        v.ingresarDatos();
        this.setVehiculo(v);
    }
    
    public void imprimirEnBloque(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Valor pagado: "+this.getMonto());
        System.out.println("Vehiculo: "+this.getVehiculo().getModelo()+"   "+this.getVehiculo().getPlaca());
    }
    
    public void imprimirEnFila(){
        System.out.println(this.getNombre()+"   "+this.getVehiculo().getModelo()+"  "+this.getVehiculo().getPlaca()+"  "+this.getMonto());
    }
}

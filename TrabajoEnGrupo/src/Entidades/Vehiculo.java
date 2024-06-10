/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Administracion.MecanicoController;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author valer
 */
public class Vehiculo {
    private String modelo;
    private String mecanico;
    private String fallo;
    private boolean estado;
    private String placa;        
            
    public Vehiculo(MecanicoController mecanicos){
        Random random = new Random();
        this.mecanico = mecanicos.getLista().get(random.nextInt(0, mecanicos.getLista().size())).getNombre();
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setMecanico(){
        
    }
    
    public void setFallo(){
        
    }
    
    public void setEstado(){
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public String getMecanico(){
        return this.mecanico;
    }
    
    public void ingresarDatos(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informacion del vehiculo");
        System.out.println("Modelo: ");
        this.setModelo(input.nextLine());
        System.out.println("Placa: ");
        this.setPlaca(input.nextLine());
    }
    
    public void imprimirEnFila(){
        
    }
    
    public void imprimirEnBloque(){
        
    }
}

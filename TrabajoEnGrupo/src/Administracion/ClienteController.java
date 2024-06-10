/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

import Entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class ClienteController {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    public void actualizar(MecanicoController mecanicos){
        Cliente c = new Cliente();
        c.ingresarDatos(mecanicos);
        clientes.add(c);
    }
    
    public void imprimir(){
        System.out.println("Nombre    Modelo   Placa   Monto Pagado");
        for(Cliente cliente : clientes){
            cliente.imprimirEnFila();
        }
    }
}

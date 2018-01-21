/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Tienda {
    private String nombre;
    private ArrayList<Factura> facturas;
    private ArrayList<Cliente> clientes; 
    private ArrayList<Asesor> asesores;
    private double utilidad;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.utilidad =0;
        this.facturas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.asesores = new ArrayList<>();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }
    public void addFacturacompra(double numero,int dia,int mes,int anio){
        Factura factura= new Compra(numero,dia,mes,anio);
        this.facturas.add(factura);
       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public abstract class Factura {

    protected double numero;
    protected int dia;
    protected int mes;
    protected int anio;
    protected ArrayList<Telefono> telefonos;
    public Factura(double numero, int dia, int mes, int anio ) {
        this.numero = numero;
        this.dia = dia;
        this.mes= mes;
        this.anio= anio;
        this.telefonos = new ArrayList<>();
    }
    
    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", telefonos=" + telefonos + '}';
    }

}

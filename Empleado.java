/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaempleados;

/**
 *
 * @author Graciela
 */
public class Empleado {
     // Atributos privados
    private String nombreCompleto;
    private int edadEmpleado;
    private double salarioMensual;

    // Constructor
    public Empleado(String nombreCompleto, int edadEmpleado, double salarioMensual) {
        this.nombreCompleto = nombreCompleto;
        this.edadEmpleado = edadEmpleado;
        this.salarioMensual = salarioMensual;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public int getEdadEmpleado() {
        return edadEmpleado;
    }
    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }
    public double getSalarioMensual() {
        return salarioMensual;
    }
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    // Método para imprimir la información del empleado
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombreCompleto + ", Edad: " + edadEmpleado + ", Salario: " + salarioMensual);
    }
}

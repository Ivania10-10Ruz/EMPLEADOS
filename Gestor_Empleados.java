/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaempleados;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Graciela
 */
public class Gestor_Empleados {
     // Lista para almacenar empleados
    private List<Empleado> listaEmpleados;

    // Constructor
    public Gestor_Empleados() {
        listaEmpleados = new ArrayList<>();
    }

    // Método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    // Método para mostrar todos los empleados
    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        for (Empleado empleado : listaEmpleados) {
            empleado.imprimirInformacion();
        }
    }
}

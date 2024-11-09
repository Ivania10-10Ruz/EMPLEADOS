/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaempleados;
import java.util.Scanner;
/**
 *
 * @author Graciela
 */
public class SistemaEmpleados {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestor_Empleados gestorEmpleados = new Gestor_Empleados();

        // Menú para agregar empleados y mostrar detalles
        while (true) {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcionSeleccionada = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcionSeleccionada) {
                case 1:
                    // Agregar empleado
                    System.out.print("Nombre completo: ");
                    String nombreCompleto = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadEmpleado = scanner.nextInt();
                    System.out.print("Salario mensual: ");
                    double salarioMensual = scanner.nextDouble();
                    gestorEmpleados.agregarEmpleado(new Empleado(nombreCompleto, edadEmpleado, salarioMensual));
                    System.out.println("Empleado agregado exitosamente.");
                    break;

                case 2:
                    // Mostrar empleados
                    gestorEmpleados.mostrarEmpleados();
                    break;

                case 3:
                    // Salir
                    System.out.println("Saliendo del sistema.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }
}

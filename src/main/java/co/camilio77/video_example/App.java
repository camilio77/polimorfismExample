package co.camilio77.video_example;

import co.camilio77.video_example.Empleado.Empleado;
import co.camilio77.video_example.Empleado.EmpleadoAsalariado;
import co.camilio77.video_example.Empleado.EmpleadoBaseMasComision;
import co.camilio77.video_example.Empleado.EmpleadoPorComision;
import co.camilio77.video_example.Empleado.EmpleadoPorHoras;

public class App {
    public static void main( String[] args ) {
        Empleado EmpleadoPorHoras;
        EmpleadoPorHoras = new EmpleadoPorHoras("Camilio", "Lopez", "123456789", 40, 20);
        System.out.println( "Objeto EmpleadoPorHoras creado" );
        Empleado EmpleadoPorComision = new EmpleadoPorComision("Ana", "Gomez", "987654321", 5000, 10);
        System.out.println( "Objeto EmpleadoPorComision creado" );
        Empleado EmpleadoBaseMasComision = new EmpleadoBaseMasComision("Luis", "Martinez", "456789123", 3000, 5, 1000);
        System.out.println( "Objeto EmpleadoBaseMasComision creado" );
        Empleado EmpleadoAsalariado = new EmpleadoAsalariado("Maria", "Rodriguez", "789123456", 800);
        System.out.println( "Objeto EmpleadoAsalariado creado" );

        System.out.println("==================================================================\nIngresos empleado por horas: ");
        System.out.println(EmpleadoPorHoras.calcularIngresos());
        System.out.println("==================================================================\nIngresos empleado por comision: ");
        System.out.println(EmpleadoPorComision.calcularIngresos());
        System.out.println("==================================================================\nIngresos empleado base mas comision: ");
        System.out.println(EmpleadoBaseMasComision.calcularIngresos());
        System.out.println("==================================================================\nIngresos empleado asalariado: ");
        System.out.println(EmpleadoAsalariado.calcularIngresos());
    }
}

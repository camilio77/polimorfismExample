package co.camilio77.video_example;

// Importación de la superclase y las subclases de Empleado
import co.camilio77.video_example.Empleado.Empleado;
import co.camilio77.video_example.Empleado.EmpleadoAsalariado;
import co.camilio77.video_example.Empleado.EmpleadoBaseMasComision;
import co.camilio77.video_example.Empleado.EmpleadoPorComision;
import co.camilio77.video_example.Empleado.EmpleadoPorHoras;

/**
 * Clase principal del programa.
 * 
 * Esta clase se encarga de crear distintos tipos de empleados y
 * demostrar el uso del polimorfismo mediante referencias de tipo Empleado.
 */
public class App {

    /**
     * Método principal del programa.
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Creación de un objeto EmpleadoPorHoras usando una referencia de tipo Empleado
        Empleado empleadoPorHoras = new EmpleadoPorHoras(
                "Camilio", "Lopez", "123456789", 40, 20
        );
        System.out.println("Objeto EmpleadoPorHoras creado:\n"
                + "Nombre: Camilio Lopez\n"
                + "Horas trabajadas: 40\n"
                + "Valor por hora: 20");

        // Creación de un empleado por comisión
        Empleado empleadoPorComision = new EmpleadoPorComision(
                "Ana", "Gomez", "987654321", 5000, 10
        );
        System.out.println("\nObjeto EmpleadoPorComision creado:\n"
                + "Nombre: Ana Gomez\n"
                + "Ventas totales: 5000\n"
                + "Tarifa de comision: 10");

        // Creación de un empleado con salario base más comisión
        Empleado empleadoBaseMasComision = new EmpleadoBaseMasComision(
                "Luis", "Martinez", "456789123", 3000, 5, 1000
        );
        System.out.println("\nObjeto EmpleadoBaseMasComision creado:\n"
                + "Nombre: Luis Martinez\n"
                + "Ventas totales: 3000\n"
                + "Tarifa de comision: 5\n"
                + "Salario base: 1000");

        // Creación de un empleado asalariado
        Empleado empleadoAsalariado = new EmpleadoAsalariado(
                "Maria", "Rodriguez", "789123456", 800
        );
        System.out.println("\nObjeto EmpleadoAsalariado creado:\n"
                + "Nombre: Maria Rodriguez\n"
                + "Salario semanal: 800");

        // Demostración del polimorfismo:
        // cada objeto responde de forma distinta al mismo método
        System.out.println("==================================================================");
        System.out.println("Ingresos empleado por horas:");
        System.out.println(empleadoPorHoras.calcularIngresos());

        System.out.println("\nIngresos empleado por comision:");
        System.out.println(empleadoPorComision.calcularIngresos());

        System.out.println("\nIngresos empleado base mas comision:");
        System.out.println(empleadoBaseMasComision.calcularIngresos());

        System.out.println("\nIngresos empleado asalariado:");
        System.out.println(empleadoAsalariado.calcularIngresos());
    }
}

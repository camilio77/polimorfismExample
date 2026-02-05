package co.camilio77.video_example.Empleado;

/**
 * Clase abstracta Empleado.
 * 
 * Representa un empleado genérico y sirve como base para los
 * diferentes tipos de empleados del sistema.
 * 
 * No puede instanciarse directamente.
 */
public abstract class Empleado {

    // Atributos comunes a todos los empleados
    private String nombre;
    private String apellido;
    private String NSS;

    /**
     * Constructor de la clase Empleado.
     * 
     * @param nombre nombre del empleado
     * @param apellido apellido del empleado
     * @param NSS número de seguridad social
     */
    public Empleado(String nombre, String apellido, String NSS) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NSS = NSS;
    }

    /**
     * Método abstracto para calcular los ingresos del empleado.
     * 
     * Cada subclase debe implementar su propia forma de calcularlos.
     * 
     * @return ingresos del empleado
     */
    public abstract int calcularIngresos();
}

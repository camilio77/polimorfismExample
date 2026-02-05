package co.camilio77.video_example.Empleado;

/**
 * Representa un empleado que recibe un salario fijo semanal.
 */
public class EmpleadoAsalariado extends Empleado {

    private int salarioSemanal;

    /**
     * Constructor del empleado asalariado.
     */
    public EmpleadoAsalariado(String nombre, String apellido, String NSS, int salarioSemanal) {
        super(nombre, apellido, NSS);
        this.salarioSemanal = salarioSemanal;
    }

    /**
     * Retorna el salario semanal del empleado.
     */
    @Override
    public int calcularIngresos() {
        return salarioSemanal;
    }
}
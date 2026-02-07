package co.camilio77.video_example.Empleado;

/**
 * Representa un empleado que recibe un salario base
 * más una comisión por ventas.
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private int salarioBase;

    /**
     * Constructor del empleado base más comisión.
     */
    public EmpleadoBaseMasComision(String nombre, String apellido, String NSS, int ventasBrutas, int tarifaComision, int salarioBase) {
        super(nombre, apellido, NSS, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula los ingresos sumando el salario base
     * a las ganancias por comisión.
     */
    @Override
    public int calcularIngresos() {
        return super.calcularIngresos() + salarioBase;
    }
}

package co.camilio77.video_example.Empleado;

/**
 * Representa un empleado cuyo ingreso depende de las ventas realizadas.
 */
public class EmpleadoPorComision extends Empleado {

    private int ventasBrutas;
    private int tarifaComision;

    /**
     * Constructor del empleado por comisión.
     */
    public EmpleadoPorComision(String nombre, String apellido, String NSS,
                               int ventasBrutas, int tarifaComision) {
        super(nombre, apellido, NSS);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    /**
     * Calcula los ingresos en función de las ventas y la comisión.
     */
    @Override
    public int calcularIngresos() {
        return ventasBrutas * tarifaComision;
    }
}

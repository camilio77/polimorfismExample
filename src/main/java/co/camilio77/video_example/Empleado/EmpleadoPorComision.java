package co.camilio77.video_example.Empleado;

public class EmpleadoPorComision extends Empleado {
    private int ventasBrutas;
    private int tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String NSS, int ventasBrutas, int tarifaComision) {
        super(nombre, apellido, NSS);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    @Override
    public int calcularIngresos() {
        return (ventasBrutas * tarifaComision);
    }

}

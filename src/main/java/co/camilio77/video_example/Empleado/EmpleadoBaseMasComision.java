package co.camilio77.video_example.Empleado;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private int salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String NSS, int ventasBrutas, int tarifaComision, int salarioBase) {
        super(nombre, apellido, NSS, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    @Override
    public int calcularIngresos() {
        return super.calcularIngresos() + salarioBase;
    }
}

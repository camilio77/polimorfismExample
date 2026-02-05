package co.camilio77.video_example.Empleado;

public class EmpleadoAsalariado extends Empleado {
    private int salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String NSS, int salarioSemanal) {
        super(nombre, apellido, NSS);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public int calcularIngresos() {
        return salarioSemanal;
    }

}

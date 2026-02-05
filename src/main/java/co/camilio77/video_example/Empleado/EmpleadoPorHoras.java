package co.camilio77.video_example.Empleado;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private int sueldoPorHora;

    public EmpleadoPorHoras(String nombre, String apellido, String NSS, int horasTrabajadas, int sueldoPorHora) {
        super(nombre, apellido, NSS);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    @Override
    public int calcularIngresos() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * sueldoPorHora;
        } else {
            int horasExtra = horasTrabajadas - 40;
            return (40 * sueldoPorHora) + (horasExtra * sueldoPorHora * 2);
        }
    }

}

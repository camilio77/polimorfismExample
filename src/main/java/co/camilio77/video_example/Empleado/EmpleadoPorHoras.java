package co.camilio77.video_example.Empleado;

/**
 * Representa un empleado que recibe un pago según las horas trabajadas.
 */
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private int sueldoPorHora;

    /**
     * Constructor del empleado por horas.
     */
    public EmpleadoPorHoras(String nombre, String apellido, String NSS,
                            int horasTrabajadas, int sueldoPorHora) {
        super(nombre, apellido, NSS);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    /**
     * Calcula los ingresos del empleado.
     * Si trabaja más de 40 horas, se pagan horas extra al doble.
     */
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

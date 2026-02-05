package co.camilio77.video_example.Empleado;

public abstract  class Empleado {
    private String nombre;
    private String apellido;
    private String NSS;

    public Empleado( String nombre, String apellido, String NSS) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NSS = NSS;
    }

    public abstract int calcularIngresos();
}

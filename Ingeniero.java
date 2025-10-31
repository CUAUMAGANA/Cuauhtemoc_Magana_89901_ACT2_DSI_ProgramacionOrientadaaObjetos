public class Ingeniero extends Empleado {
    private String especialidad;

    public Ingeniero(String nombre, int id, double salario, String especialidad) {
        super(nombre, id, salario);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
    }

    public void mostrarEspecialidad() {
        System.out.println("Especialidad del ingeniero: " + especialidad);
    }
}
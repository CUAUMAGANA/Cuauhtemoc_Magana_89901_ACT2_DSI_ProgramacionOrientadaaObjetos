public class Contador extends Empleado {
    private String certificacion;

    public Contador(String nombre, int id, double salario, String certificacion) {
        super(nombre, id, salario);
        this.certificacion = certificacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Certificación: " + certificacion);
    }

    public void mostrarCertificacion() {
        System.out.println("Certificación del contador: " + certificacion);
    }
}

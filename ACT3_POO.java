// Clase base Empleado
public class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: $" + salario);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }
}

// Subclase Ingeniero
class Ingeniero extends Empleado {
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

// Subclase Contador
class Contador extends Empleado {
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

// Clase principal
public class ACT3_Herencia {
    public static void main(String[] args) {
        Ingeniero ing = new Ingeniero("Cuauhtémoc Magaña", 101, 45000.0, "Software");
        Contador cont = new Contador("Ludivina Vázquez", 102, 42000.0, "CPA");

        System.out.println("=== Ingeniero ===");
        ing.mostrarInformacion();
        System.out.println("Salario anual: $" + ing.calcularSalarioAnual());
        ing.mostrarEspecialidad();

        System.out.println("\n=== Contador ===");
        cont.mostrarInformacion();
        System.out.println("Salario anual: $" + cont.calcularSalarioAnual());
        cont.mostrarCertificacion();
    }
}
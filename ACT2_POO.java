public class ACT2_POO {

    // Clase interna Empleado
    static class Empleado {
        private String nombre;
        private int id;
        private String puesto;
        private double salario;

        public Empleado(String nombre, int id, String puesto, double salario) {
            this.nombre = nombre;
            this.id = id;
            this.puesto = puesto;
            this.salario = salario;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("ID: " + id);
            System.out.println("Puesto: " + puesto);
            System.out.println("Salario: $" + salario);
        }

        public double calcularSalarioAnual() {
            return salario * 12;
        }
    }

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Cuauhtémoc Magaña", 101, "Ingeniero", 45000.0);
        Empleado emp2 = new Empleado("Ludivina Vázquez", 102, "Contadora", 42000.0);

        emp1.mostrarInformacion();
        System.out.println("Salario anual: $" + emp1.calcularSalarioAnual());

        System.out.println();

        emp2.mostrarInformacion();
        System.out.println("Salario anual: $" + emp2.calcularSalarioAnual());
    }
}

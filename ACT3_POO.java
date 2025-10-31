public class ACT3_POO {
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
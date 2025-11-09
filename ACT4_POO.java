// ============================================================
// Programa: ACT4_POO-Sistema de Gestión de Inventario (Java)
// Autor: Cuauhtémoc Magaña Hernández
// Matrícula: 89901 
// Descripción: Ejemplo de aplicación de polimorfismo,
// clases abstractas e interfaces en Java.
// ============================================================

// 1️⃣ INTERFAZ - Define comportamiento común
interface Descuento {
    double calcularDescuento(double porcentaje);
}

// 2️⃣ CLASE ABSTRACTA - Define atributos y métodos comunes
abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método abstracto que será implementado por las subclases
    public abstract void mostrarDetalles();

    // Método común para todos los productos
    public double calcularValorInventario() {
        return precio * cantidad;
    }
}

// 3️⃣ SUBCLASE ELECTRÓNICO - Hereda de Producto e implementa la interfaz Descuento
class Electronico extends Producto implements Descuento {
    private int garantiaMeses;

    public Electronico(String nombre, double precio, int cantidad, int garantiaMeses) {
        super(nombre, precio, cantidad);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("📱 Electrónico: " + nombre);
        System.out.println("   Precio: $" + precio);
        System.out.println("   Cantidad: " + cantidad);
        System.out.println("   Garantía: " + garantiaMeses + " meses");
    }

    @Override
    public double calcularDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}

// 4️⃣ SUBCLASE ALIMENTO
class Alimento extends Producto implements Descuento {
    private String fechaCaducidad;

    public Alimento(String nombre, double precio, int cantidad, String fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("🥫 Alimento: " + nombre);
        System.out.println("   Precio: $" + precio);
        System.out.println("   Cantidad: " + cantidad);
        System.out.println("   Fecha de caducidad: " + fechaCaducidad);
    }

    @Override
    public double calcularDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}

// 5️⃣ SUBCLASE ROPA
class Ropa extends Producto implements Descuento {
    private String talla;

    public Ropa(String nombre, double precio, int cantidad, String talla) {
        super(nombre, precio, cantidad);
        this.talla = talla;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("👕 Ropa: " + nombre);
        System.out.println("   Precio: $" + precio);
        System.out.println("   Cantidad: " + cantidad);
        System.out.println("   Talla: " + talla);
    }

    @Override
    public double calcularDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}

// 6️⃣ CLASE PRINCIPAL
public class ACT4_POO {
    public static void main(String[] args) {

        // Creación de objetos usando polimorfismo
        Producto p1 = new Electronico("Laptop Lenovo", 12000, 5, 24);
        Producto p2 = new Alimento("Cereal Integral", 85, 30, "12/12/2025");
        Producto p3 = new Ropa("Playera Nike", 550, 10, "M");

        // Arreglo polimórfico
        Producto[] productos = {p1, p2, p3};

        // Ciclo for (estructuras de control)
        for (Producto p : productos) {
            p.mostrarDetalles(); // Polimorfismo en acción
            System.out.println("   Valor en inventario: $" + p.calcularValorInventario());
            System.out.println("----------------------------------------");
        }

        // Ciclo while (estructura repetitiva)
        int i = 0;
        System.out.println("\n💸 Aplicando descuentos del 10% a todos los productos:");
        while (i < productos.length) {
            if (productos[i] instanceof Descuento) {
                Descuento d = (Descuento) productos[i];
                System.out.println("   " + productos[i].nombre + ": Nuevo precio $" + d.calcularDescuento(10));
            }
            i++;
        }
    }
}

import java.util.Locale;
import java.util.Scanner;

public class CarritoSuma {

    /**
     * Representa un producto del catálogo.
     */
    static class Producto {
        private final String nombre;
        private final double precio;

        /**
         * Crea un producto con nombre y precio base.
         * 
         * @param nombre nombre comercial
         * @param precio precio en euros (>= 0)
         */
        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        /** @return nombre del producto */
        public String getNombre() {
            return nombre;
        }

        /** @return precio del producto */
        public double getPrecio() {
            return precio;
        }

        @Override
        public String toString() {
            return String.format("%s - %.2f €", nombre, precio);
        }
    }

    /**
     * Suma los precios de todos los productos del carrito.
     * 
     * @param carrito array de productos (no nulo)
     * @return suma total en euros
     */
    public static double totalCarrito(Producto[] carrito) {
        for (double i = 0; i < carrito.length; i++) {
            Producto producto = carrito[i];
            producto.getPrecio();
        }
        return 0.0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio de teclado");
        double Teclado = sc.nextDouble();
        System.out.println("precio de raton");
        double Raton = sc.nextDouble();
        System.out.println("precio de auriculares");
        double Auriculares = sc.nextDouble();
        Producto[] carrito = {
                new Producto("Teclado", Teclado),
                new Producto("Ratón", Raton),
                new Producto("Auriculares", Auriculares)
        };
        double totalCarrito = totalCarrito(carrito);
        System.out.printf("Total: %.2f $", totalCarrito);
        sc.close();
    }
}

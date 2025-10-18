import java.util.Locale;


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
        double total=0;
        for (int i = 0; i < carrito.length; i++) {
            Producto p = carrito[i];
            total +=p.getPrecio();
        }
        return total;

    }

    public static void main(String[] args) {
        
        Producto[] carrito = {
                new Producto("Teclado", 24.99),
                new Producto("Ratón", 15.50),
                new Producto("Auriculares", 39.90)
        };
        double totalCarrito = totalCarrito(carrito);
        System.out.printf("Total: %.2f $", totalCarrito);
        
    }
}

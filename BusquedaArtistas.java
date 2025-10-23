import java.util.Locale;
import java.util.Scanner;

public class BusquedaArtistas {

    /**
     * Representa a un artista con nombre y número de seguidores (en miles).
     */
    static class Artista {
        private final String nombre;
        private final int seguidoresMiles;

        public Artista(String nombre, int seguidoresMiles) {
            this.nombre = nombre;
            this.seguidoresMiles = seguidoresMiles;
        }

        public String getNombre() {
            return nombre;
        }

        public int getSeguidoresMiles() {
            return seguidoresMiles;
        }

        @Override
        public String toString() {
            return String.format("%s (%,dK seguidores)", nombre, seguidoresMiles);
        }
    }

    // ------------------------------------------------------------
    // MÉTODOS a IMPLEMENTAR
    // ------------------------------------------------------------

    /**
     * Devuelve el índice de la primera coincidencia por nombre (ignora mayúsculas).
     * 
     * @param cartel        array de artistas
     * @param nombreBuscado nombre a buscar
     * @return índice (0..n-1) o -1 si no existe
     */
    public static int indiceDe(Artista[] cartel, String nombreBuscado) {
        for (int i = 0; i < cartel.length; i++) {
            if (cartel[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                return i;
            }

            // Recorre el array 'cartel' y compara cartel[i].getNombre()
            // con 'nombreBuscado' usando equalsIgnoreCase.
            // Si coincide, devuelve i. Si terminas el bucle sin encontrarlo, devuelve -1.
        }
        return -1;
    }

    /**
     * Indica si existe un artista con ese nombre.
     * 
     * @param cartel        array de artistas
     * @param nombreBuscado nombre a buscar
     * @return true si existe, false en caso contrario
     */
    public static boolean existe(Artista[] cartel, String nombreBuscado) {
        for (int i = 0; i > cartel.length; i++) {
            if (!(indiceDe(cartel, nombreBuscado) == -1)) {
                return true;
            }
        }
        // TODO:
        // Devuelve true si indiceDe(cartel, nombreBuscado) es distinto de -1.
        // En caso contrario, false.
        return false;
    }

    /**
     * Devuelve un array con todos los índices donde el nombre coincide (ignora
     * mayúsculas).
     * Si no hay coincidencias, devuelve un array de longitud 0.
     * 
     * @param cartel        array de artistas
     * @param nombreBuscado nombre a buscar
     * @return array con índices de coincidencias
     */
    public static int[] indicesDeTodos(Artista[] cartel, String nombreBuscado) {

        // TODO:
        // 1) Recorre el array y cuenta cuántas coincidencias hay (equalsIgnoreCase).

        // 2) Crea un nuevo int[] del tamaño contado.
        // 3) Recorre de nuevo y rellena ese array con los índices encontrados.
        // 4) Devuélvelo.
        return new int[0];
    }

    /**
     * Devuelve un array con los índices de artistas cuyo nombre empieza por la
     * 'inicial' dada.
     * No distingue mayúsculas/minúsculas. Si no hay, devuelve array de longitud 0.
     * 
     * @param cartel  array de artistas
     * @param inicial letra inicial a filtrar (por ejemplo 'A' o 'q')
     * @return array con índices de artistas que empiezan por esa letra
     */
    public static int[] indicesPorInicial(Artista[] cartel, char inicial) {
        // TODO:
        // Pista: compara Character.toLowerCase(inicial) con
        // Character.toLowerCase(cartel[i].getNombre().charAt(0)).
        // Haz el mismo patrón de "contar -> crear array -> rellenar -> devolver".
        return new int[0];
    }

    /**
     * Devuelve los índices de artistas cuyo nombre empieza por 'inicial' (ignora
     * mayúsculas)
     * y cuyo número de seguidores (en miles) está entre 'min' y 'max' (INCLUSIVO).
     * Si no hay, devuelve array de longitud 0.
     */
    public static int[] indicesPorInicialYSeguidores(Artista[] cartel, char inicial,
            int minSeguidoresMiles, int maxSeguidoresMiles) {
        // TODO:
        // 1) Normaliza la inicial con Character.toLowerCase(inicial).
        // 2) Primera pasada: cuenta cuántos cumplen:
        // - Empieza por esa inicial (ignorando mayúsculas).
        // - seguidoresMiles >= minSeguidoresMiles && <= maxSeguidoresMiles.
        // 3) Crea un int[] del tamaño contado.
        // 4) Segunda pasada: rellena el array con los índices que cumplen.
        // 5) Devuelve el array.
        return new int[0];
    }

    /**
     * Imprime por pantalla los artistas indicados por sus índices.
     * Formato: " - [idx] Artista (…,K seguidores)"
     * Si el array de índices está vacío, no imprime nada.
     */
    public static void mostrarArtistas(Artista[] cartel, int[] indices) {
        // TODO:
        // Recorre 'indices' y para cada 'idx' imprime:
        // System.out.println(" - [" + idx + "] " + cartel[idx]);
        // (No hagas bucles en main; hazlos aquí).
    }

    // ------------------------------------------------------------
    // MAIN de pruebas (usará los métodos obligatorios)
    // ------------------------------------------------------------

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        // Cartel inicial (12 artistas)
        Artista[] cartel = {
                new Artista("Aitana", 1200),
                new Artista("Quevedo", 2500),
                new Artista("Bad Gyal", 900),
                new Artista("Rosalía", 3100),
                new Artista("Bizarrap", 5400),
                new Artista("Lola Índigo", 850),
                new Artista("Rels B", 2000),
                new Artista("Saiko", 1500),
                new Artista("Feid", 4200),
                new Artista("Karol G", 6800),
                new Artista("Rauw Alejandro", 3600),
                new Artista("Morad", 2700)
        };

        // Búsqueda de primera coincidencia
        System.out.print("Artista a buscar (primera coincidencia): ");
        String nombre = sc.nextLine().trim();
        int pos = indiceDe(cartel, nombre);
        if (pos >= 0) {
            System.out.println("✔ " + nombre + " actúa. Índice: " + pos);
            System.out.println("  Detalles: " + cartel[pos]);
        } else {
            System.out.println("✘ " + nombre + " no actúa en el festival.");
        }

        // Búsqueda todas las coincidencias por nombre
        System.out.print("\nArtista para listar TODAS las coincidencias: ");
        String nombreTodas = sc.nextLine().trim();
        int[] todos = indicesDeTodos(cartel, nombreTodas);
        if (todos.length > 0) {
            System.out.println("Coincidencias: " + todos.length);
            mostrarArtistas(cartel, todos); // <-- sin for en main
        } else {
            System.out.println("No hay coincidencias para \"" + nombreTodas + "\".");
        }

        // Búsqueda de artistas por inicial
        System.out.print("\nLetra inicial (si dejas vacío usaré 'A'): ");
        String entrada = sc.nextLine().trim();

        char inicial = 'A';
        if (entrada.length() > 0) {
            inicial = entrada.charAt(0);
        }
        System.out.println("Usando la inicial: " + Character.toUpperCase(inicial));
        int[] porInicial = indicesPorInicial(cartel, inicial);
        if (porInicial.length > 0) {
            System.out.println("Artistas que empiezan por '" + Character.toUpperCase(inicial) + "':");
            mostrarArtistas(cartel, porInicial); // <-- sin for en main
        } else {
            System.out.println("No hay artistas que empiecen por '" + Character.toUpperCase(inicial) + "'.");
        }

        // Búsqueda por inicial + rango de seguidores (en miles)
        System.out.print("\nInicial para filtrar (vacío='A'): ");
        String entradaIni = sc.nextLine().trim();
        char inicial2 = 'A';
        if (entradaIni.length() > 0) {
            inicial2 = entradaIni.charAt(0);
        }

        System.out.print("Mínimo de seguidores en miles (vacío=0): ");
        String sMin = sc.nextLine().trim();
        int min = 0;
        if (sMin.length() > 0) {
            min = Integer.parseInt(sMin);
        }

        System.out.print("Máximo de seguidores en miles (vacío=1000000): ");
        String sMax = sc.nextLine().trim();
        int max = 1000000;
        if (sMax.length() > 0) {
            max = Integer.parseInt(sMax);
        }

        int[] filtrados = indicesPorInicialYSeguidores(cartel, inicial2, min, max);
        if (filtrados.length > 0) {
            System.out.println("\nArtistas que empiezan por '" + Character.toUpperCase(inicial2)
                    + "' y tienen entre " + min + "K y " + max + "K seguidores:");
            mostrarArtistas(cartel, filtrados);
        } else {
            System.out.println("\nNo hay artistas que cumplan ambos filtros.");
        }

        sc.close();
    }
}
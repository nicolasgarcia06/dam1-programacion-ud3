import java.util.Scanner;

public class ResultadosAtleti {

    /**
     * Representa un partido con rival y goles a favor/en contra.
     */
    static class Partido {
        private final String rival;
        private final int golesMarcados; // a favor
        private final int golesRecibidos; // en contra

        /**
         * Crea un nuevo partido.
         *
         * @param rival          nombre del equipo rival
         * @param golesMarcados  goles a favor del Atlético
         * @param golesRecibidos goles en contra del Atlético
         */
        public Partido(String rival, int golesMarcados, int golesRecibidos) {
            this.rival = rival;
            this.golesMarcados = golesMarcados;
            this.golesRecibidos = golesRecibidos;
        }

        /** @return rival */
        public String getRival() {
            return rival;
        }

        /** @return goles a favor */
        public int getGolesMarcados() {
            return golesMarcados;
        }

        /** @return goles en contra */
        public int getGolesRecibidos() {
            return golesRecibidos;
        }

        @Override
        public String toString() {
            return String.format("vs %s (%d-%d)", rival, golesMarcados, golesRecibidos);
        }
    }

    // ---------------------------------------------------------------------
    // MÉTODOS A IMPLEMENTAR (como en el ejercicio de notas)
    // ---------------------------------------------------------------------

    /**
     * Calcula la media aritmética de los goles MARCADOS por partido.
     *
     * @param temporada array de partidos (no nulo ni vacío)
     * @return media de goles marcados
     */
    public static double mediaGolesMarcados(Partido[] temporada) {
        int suma = 0;
        for (int i = 0; i < temporada.length; i++) {
            Partido t = temporada[i];
            suma += t.getGolesMarcados();

        }
        return suma / temporada.length;
    }

    /**
     * Devuelve el partido con MÁS goles marcados.
     *
     * @param temporada array de partidos (no nulo ni vacío)
     * @return partido con el máximo de goles a favor
     */
    public static Partido partidoMasGolesMarcados(Partido[] temporada) {
        Partido mejor=temporada[0];
        for (int i = 1; i < temporada.length; i++) {
            if(temporada[i].getGolesMarcados() > mejor.getGolesMarcados()){}
        mejor=temporada[1];
    }
    return mejor;
    }
    /**
     * Devuelve el partido con MENOS goles marcados.
     *
     * @param temporada array de partidos (no nulo ni vacío)
     * @return partido con el mínimo de goles a favor
     */
    public static Partido partidoMenosGolesMarcados(Partido[] temporada) {
        Partido peor = temporada[0];
        for (int i = 1; i < temporada.length; i++) {
            if (temporada[i].getGolesMarcados() < peor.getGolesMarcados()) {
                peor = temporada[i];
            }
        }
        return peor;

    }
    // ---------------------------------------------------------------------
    // EXTRAS (opcional, por si quieres pedir suma de goles)
    // ---------------------------------------------------------------------

    /**
     * Suma total de goles marcados en la temporada.
     */
    public static int totalGolesMarcados(Partido[] temporada) {
        int total=0;
                for (int i = 0; i < temporada.length; i++) {
          
                 total +=temporada[i].getGolesMarcados();
                }
        return total;
        }
    
    /**
     * Suma total de goles recibidos en la temporada.
     */
    public static int totalGolesRecibidos(Partido[] temporada) {
        // TODO (opcional):
        // 1. Acumula getGolesRecibidos() en un int y devuelve.
        return 0;
    }

    // ---------------------------------------------------------------------
    // MAIN
    // ---------------------------------------------------------------------

    /**
     * Método principal: crea una lista de partidos de ejemplo y usa los métodos.
     */
    public static void main(String[] args) {

        // 1️⃣ Ejemplo con datos fijos (puedes cambiarlos o leerlos con Scanner)
        Partido[] temporada = {
                new Partido("Sevilla", 3, 1),
                new Partido("Real Sociedad", 2, 1),
                new Partido("Valencia", 0, 0),
                new Partido("Barcelona", 2, 3),
                new Partido("Real Madrid", 0, 5),
                new Partido("Rayo Vallecano", 4, 2)
        };

        // 2️⃣ Llama a los métodos y muestra resultados
         double media = mediaGolesMarcados(temporada);
         Partido mas = partidoMasGolesMarcados(temporada);
         Partido menos = partidoMenosGolesMarcados(temporada);
        //
        // // Extras:
         int marcados = totalGolesMarcados(temporada);
         int recibidos = totalGolesRecibidos(temporada);

        // 3️⃣ Muestra por pantalla (quita los comentarios al implementar)
         System.out.printf("Media de goles marcados: %.2f%n", media);
         System.out.printf("Partido con MÁS goles marcados: %s%n", mas);
         System.out.printf("Partido con MENOS goles marcados: %s%n", menos);
         System.out.printf("TOTAL goles marcados: %d | TOTAL goles recibidos: %d%n",
         marcados, recibidos);

    }
}

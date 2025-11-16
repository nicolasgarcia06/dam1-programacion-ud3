import java.util.Arrays;

public class RegistroSemanalTemperaturas {

    // --- Declaraciones (impleméntalas tú según el enunciado) ---
    public static boolean validar(int[][] m) {
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(m[i][j]<(-10) && m[i][j]>45){
                    return false;
                }
            }
        }
        return true;
    }
    public static double[] mediasDiarias(int[][] m) {
        double[] media=new double[m.length];
        for(int i=0;i<m.length;i++){
            double suma=0.0;
            for(int j=0;j<m[i].length;j++){
suma +=m[i][j];
            }
             media[i]=suma/m.length;
        }
        return media;
    
}
    public static int[] maximosPorFranja(int[][] m) {
        
int[] maximos = new int[m[0].length]; // 3 franjas: mañana, tarde, noche

    // Inicializamos con el primer día
    for (int j = 0; j < m[0].length; j++) {
        maximos[j] = m[0][j];
    }

    // Recorremos el resto de días
    for (int i = 1; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            if (m[i][j] > maximos[j]) {
                maximos[j] = m[i][j];
            }
        }
    }

    return maximos;

    }
    public static double[] mediasPorFranja(int[][] m) {
        
double[] media = new double[m[0].length]; // 3 franjas: mañana, tarde, noche

    for (int j = 0; j < m[0].length; j++) { // recorremos columnas (franjas)
        double suma = 0.0;
        for (int i = 0; i < m.length; i++) { // recorremos filas (días)
            suma += m[i][j];
        }
        media[j] = suma / m.length; // media por franja
    }

    return media;

        
    }
    public static void imprimirPorDia(int[][] m) {
    for (int i = 0; i < m.length; i++) {
        System.out.println("Día " + (i + 1) + ": Mañana=" + m[i][0] +
                           ", Tarde=" + m[i][1] +
                           ", Noche=" + m[i][2]);
    }
}

    public static void main(String[] args) {
        // Matriz 7x3 ya rellena (días × [mañana, tarde, noche])
        int[][] m = {
                {15, 22, 18},
                {20, 25, 19},
                {12, 17, 16},
                {28, 30, 26},
                {10, 14, 13},
                {21, 23, 20},
                {18, 27, 24}
        };

        // Llamadas a los métodos (debes tenerlos implementados)
        if (!validar(m)) {
            System.out.println("Hay valores fuera de [-10, 45].");
            return;
        }

        double[] mediasDia = mediasDiarias(m);
        int[] maxFranjas = maximosPorFranja(m);        // [maxMañana, maxTarde, maxNoche]
        double[] mediasFranjas = mediasPorFranja(m);   // [mediaMañanas, mediaTardes, mediaNoches]

        imprimirPorDia(m);

        System.out.println("Medias por día: " + Arrays.toString(mediasDia));
        System.out.println("Máximos por franja [mañana, tarde, noche]: " + Arrays.toString(maxFranjas));
        System.out.println("Medias por franja [mañanas, tardes, noches]: " + Arrays.toString(mediasFranjas));
    }


}


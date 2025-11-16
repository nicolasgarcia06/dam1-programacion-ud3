import java.util.Arrays;
import java.text.DecimalFormat;

public class NotasMedias {
    // --- Declaraciones (stubs) ---
    public static double[] mediasPorAlumno(int[][] m) {
        double[] media = new double[m.length];
        for (int i = 0; i < m.length; i++) {
            double suma = 0.0;
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
            media[i] = suma / m[i].length;
        }
        return media;

    }

    public static double mediaGeneral(int[][] m) {
        double suma = 0.0;
        int contador = 0;
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];

                contador++;
            }

        }
        return suma / contador;
    }

    public static int contarSuspensos(int[][] m) {
        int t = 0;
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 5) {
                    t++;
                }
            }
        }
        return t;
    }

    public static int maximo(int[][] m) {
        return 0;
    }

    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        // Matriz 5x4: 5 alumnos × 4 asignaturas (ejemplo con algunos suspensos)
        int[][] m = {
                { 7, 5, 3, 8 },
                { 9, 6, 5, 4 },
                { 2, 3, 1, 5 },
                { 10, 9, 8, 7 },
                { 6, 6, 6, 6 }
        };

        // Llamadas (implementa estos métodos según el enunciado)
        double[] mediasAlu = mediasPorAlumno(m);
        double mediaGrp = mediaGeneral(m);
        int max = maximo(m);
        int suspensos = contarSuspensos(m);

        // Salida
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("Notas:");
        imprimirMatriz(m);
        System.out.println("Medias por alumno: " + Arrays.toString(
                Arrays.stream(mediasAlu).map(v -> Double.valueOf(df.format(v))).toArray()));
        System.out.println("Media general: " + df.format(mediaGrp));
        System.out.println("Nota máxima: " + max);
        System.out.println("Suspensos totales: " + suspensos);
    }

}

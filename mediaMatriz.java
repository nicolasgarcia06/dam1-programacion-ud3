public class mediaMatriz {
    public static double [] =
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
public static void main(String[] args) {
    int[][] notas = new int[][]{
            {3,4,5},
            {3,6,5},
            {7,8,5},
            {7,7,5}
    };


}
 
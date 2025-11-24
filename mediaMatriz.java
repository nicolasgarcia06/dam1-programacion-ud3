public class mediaMatriz {
    public static double [] MediaFila(int [][] m){
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
}
public static void MediaMasAlta(int [] media){
    int mejor=0;
    for (int i = 1; i < media.length; i++) {
        if(media[i]>media[mejor]){
            mejor=media[i];
        }
}
 System.out.printf("El alumno nº %d tiene la mejor nota media: %.2f",mejor);
}
public static void main(String[] args) {
    int[][] notas = new int[][]{
            {3,4,5},
            {3,6,5},
            {7,8,5},
            {7,7,5},
    };
double[] notasMediasAlumnos=MediaFila(notas);
MediaMasAlta(notas);


}
 
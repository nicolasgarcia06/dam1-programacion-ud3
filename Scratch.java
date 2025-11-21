import java.util.Arrays;

class Scratch {

    public static void main(String[] args) {
        int[][] notasAlumnos = new int[][]{
                {3, 4, 5},
                {3, 6, 5},
                {7, 8, 5},
                {7, 7, 5}
        };
        double[] notasMediasAlumnos = calcularMedias(notasAlumnos);
        mostrarNotaMasAlta(notasMediasAlumnos);
    }

    public static void mostrarNotaMasAlta(double[] notasAlumnos) {
        int mejorNotaIndice = 0;
        for(int i = 1; i < notasAlumnos.length; i++){
            if (notasAlumnos[i]>notasAlumnos[mejorNotaIndice]){
                mejorNotaIndice = i;
            }
        }
        System.out.printf("El alumno nº %d tiene la mejor nota media: %.2f",mejorNotaIndice,notasAlumnos[mejorNotaIndice]);
    }
    public static double[] calcularMedias(int[][] notas) {
        double[] medias = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            //medias[i] = Arrays.stream(notas[i]).average().getAsDouble();
            double sumaNotasAlumno = 0;
            for(int j = 0; j < notas[i].length; j++){
                sumaNotasAlumno += notas[i][j];
            }
            medias[i] = sumaNotasAlumno / notas[i].length;
        }
        return medias;
    }
}
 

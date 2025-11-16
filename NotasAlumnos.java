public class NotasAlumnos {
public static void main(String[] args) {
    int[][] notasAlumnos = new int[][]{
         {3,4,5},
            {9,2,3},
            {5,6,1},
            {8,6,1},
    };
    double[] notasMedia=AlumnosNotas(notasAlumnos);
    System.out.println(notasMedia);
}
public static double[] AlumnosNotas(int[][] array){
double [] media=new double(array.length);
for(int i=0;i<array.length;i++){
    double suma=0.0;
    for(int j=0; j<array[i].length;j++){
suma +=array[i][j];
    }
media[i]=suma/array[i].length;
}
return media;
}

}

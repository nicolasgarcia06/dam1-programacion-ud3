public class OperacionesMatrices {
    public static void main(String[] args) {
        int[][] A = {
            {1, 4, 2},
            {5, 0, 3},
            {2, 2, 9}
        };
        int[][] B = {
            {3, 1, 2},
            {2, 7, 3},
            {2, 5, 4}
        };

        int[][] Csum = suma(A, B);
        int[][] Crest = resta(A, B);
        int[][] Cmul = productoElemento(A, B);
        
        
        double[][] Cavg = medias(A, B);

        System.out.println("Suma:");
        imprimir(Csum);
        System.out.println("Resta:");
        imprimir(Crest);
        System.out.println("Producto elemento:");
        imprimir(Cmul);
        System.out.println("Maximos:");
    
        System.out.println("Comparativa (-1,0,1):");
        
        System.out.println("Medias:");
        imprimir(Cavg);
    }

    // ---- Stubs (impleméntalos tú) ----
    static int[][] suma(int[][] A, int[][] B){ 
        int resultado[][]=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                resultado[i][j]=A[i][j] + B[i][j];
            }
        }
	    return resultado;
    }
    static int[][] resta(int[][] A, int[][] B){ 
    int resultado[][]=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                resultado[i][j]=A[i][j] - B[i][j];
            }
        }
	    return resultado;
    }
    static int[][] productoElemento(int[][] A, int[][] B){ 
     int resultado[][]=new int[A.length][A[0].length];
     
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                resultado[i][j]=A[i][j] * B[i][j];
            }
        }
	    return resultado;
    }
    
    static double[][] medias(int[][] A, int[][] B){
    double resultado[][]=new double[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            
            for(int j=0;j<A[0].length;j++){
                resultado[i][j]=A[i][j] + B[i][j]/2;
    }
}
return resultado;
    }
    static void imprimir(int[][] M){
      for(int i=0;i<M.length;i++){
            
            for(int j=0;j<M[0].length;j++){
                System.out.println(M[i][j]);
    }
}
    }
    static void imprimir(double[][] M){
    
    }
}


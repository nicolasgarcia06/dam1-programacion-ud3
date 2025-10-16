public class IntroduccionArrayas {
    public static void mostrarTemperaturas(int[] temperaturas) {
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("dias de la semana " + i);
        }
    }

    public static void main(String[] args) {
        int[] maxTemperaturas = { 22, 23, 24, 24, 23, 21, 20 };
        mostrarTemperaturas(maxTemperaturas);
    }
}

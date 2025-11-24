
import java.util.Scanner;

public class AnalizadorNumeros {

    public static int[] analizer(String[] numsString) {
        int[] numbers = new int[numsString.length];
        System.out.printf("Se han introducido %d números%n", numsString.length);
        for (int i = 0; i < numsString.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numsString[i]);

            } catch (NumberFormatException e ) {
                // System.out.println("Sigue el formato correcto!");
                // continue;

            }
        }
        return numbers;
    }

    public static void maxMin(int[] numbers) {
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        int min = max;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.printf("El número mayor es: %d %nEl número menor es: %d%n", max, min);

    }

    public static void giveIndex (int[] numbers, int index){

        System.out.println(numbers[index]);

    }

    public boolean isValidInput(String input){
        String cleanInput = input.trim().replace(",","");
        for (char c : cleanInput.toCharArray()) {
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena de números separados por comas: ");
        String numArr = sc.nextLine();

        String[] nums = numArr.replace(" ", "").split(",");
        // split separa por bloques, podriamos poner trim() en vez de replace.

        int[] numbers = analizer(nums);
        maxMin(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        try{
            System.out.print("Introduce un índice buscar: ");
            int index = sc.nextInt();
            sc.nextLine();
            giveIndex(numbers,index);

        } catch (Exception notNumber ){
            System.out.printf("Ese número no es válido (0-%d)",numbers.length);
        }
        sc.close();



    }
}
 
 
 

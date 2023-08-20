import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[8];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }


        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }


        System.out.print("Массив после замены: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
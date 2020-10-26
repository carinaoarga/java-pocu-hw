import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        System.out.println("The sum of the first 100 numbers higher than 0: " + sumOfFirst100());

        smallestNumberOfArray();
    }

    public static int sumOfFirst100() {
        int sum = 0;

        for(int i = 1; i <= 100; i++){
            sum+= i;
        }

        return sum;
    }

    public static void smallestNumberOfArray(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements you want in the array: ");
        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];

        for (int i=0; i < arraySize; i++){
            System.out.println("Give element number" +(i+1)+": ");
            numbers[i] = scanner.nextInt();
        }

        int smallest = numbers[0];

        for(int x : numbers){

            smallest = Math.min(x, smallest);

        }
        System.out.println("Smallest element of the array is: " + smallest);
    }
}

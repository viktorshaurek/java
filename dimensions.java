import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoDimensionalArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();

  
            int[][] array = new int[rows][columns];
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter element at position (" + i + ", " + j + "): ");
                    array[i][j] = scanner.nextInt();
                }
            }

           
            int sum = calculateSum(array);
            double average = calculateAverage(array);

           
            System.out.println("Sum of the elements: " + sum);
            System.out.println("Average of the elements: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            
            scanner.close();
        }
    }

    private static int calculateSum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    private static double calculateAverage(int[][] array) {
        int totalElements = array.length * array[0].length;
        int sum = calculateSum(array);
        return (double) sum / totalElements;
    }
}

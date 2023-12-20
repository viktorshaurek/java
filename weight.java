import java.util.Scanner;

public class InputProcessingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter text (or 'END' to finish): ");
            String text = scanner.nextLine();

            
            if (text.equals("END")) {
                break;
            }

            int length = text.length();
            int weight = calculateWeight(text);

            System.out.println("Length: " + length);
            System.out.println("Weight: " + weight);
        } while (true);
      
        scanner.close();
    }

    private static int calculateWeight(String text) {
        int weight = 0;
        for (char ch : text.toCharArray()) {
            weight += (int) ch; // Sum of ASCII values of characters
        }
        return weight;
    }
}

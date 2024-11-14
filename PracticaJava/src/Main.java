import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String email = readInput();
        boolean result = false;
        for (int i = 0; i < email.length(); i++) {
          
        }

        System.out.println(result);
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }
}
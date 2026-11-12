import java.util.Scanner;

public class NumberFormatter {
    public static void main(String[] args) {
     Scanner scanner = new Scfnner(System.in);
     String input = scanner.nextLine();
     String separator = ",";
     String regex = "(?<=\\d)(?=(\\d{3})+(?!\\d))";
     String result = input.replaceAll(regex, separator);
     System.out.println(result);

        scanner.close();
    }
}

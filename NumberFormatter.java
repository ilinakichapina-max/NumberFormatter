public class NumberFormatter {
    public static void main(String[] args) {
        String input = "12345678";
        String separator = ",";
        String regex = "(?<=\\d)(?=(\\d{3})+(?!\\d))";
        String result = input.replaceAll(regex, separator);
        System.out.println(result);
    }
}

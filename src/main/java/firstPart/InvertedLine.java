package firstPart;

// 1.2 Перевернуть строку
public class InvertedLine {
    public static void main(String[] args) {
        char[] strings = "andersen".toCharArray();
        System.out.println("Before inverting: ");
        for (char s : strings) {
            System.out.print(s + " ");
        }
        for (int i = 0; i < strings.length / 2; i++) {
            char temp = strings[i];
            strings[i] = strings[strings.length - (i + 1)];
            strings[strings.length - (i + 1)] = temp;
        }
        System.out.println("\nAfter inverting: ");
        for (char s : strings) {
            System.out.print(s + " ");
        }
    }
}

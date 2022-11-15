package firstPart;

// 1.2 Заменить символ в строке
public class СharacterSubstitution {
    public static void main(String[] args) {
        char[] strings = "andersen".toCharArray();
        char symbolToSub = 'r'; // символ, на который хотим заменить
        System.out.println("Before substitution:");
        for (char s : strings) {
            System.out.print(s + " ");
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == 'e') // заменяемый символ
                strings[i] = symbolToSub;
        }
        System.out.println("\nAfter substitution:");
        for (char s : strings) {
            System.out.print(s + " ");
        }
    }
}
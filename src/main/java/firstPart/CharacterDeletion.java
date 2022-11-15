package firstPart;

// 1.3 Удалить определенный символ в строке
public class CharacterDeletion {
    public static void main(String[] args) {
        char[] strings = "andersen".toCharArray();
        char symbolToDel = 'r'; // символ, который хотим удалить
        System.out.println("Before substitution:");
        for (char s : strings) {
            System.out.print(s + " ");
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == symbolToDel) {
                strings[i] = strings[i + 1];
                strings[i + 1] = strings[i + 2];
            }
        }
        System.out.println("\nAfter substitution:");
        for (char s : strings) {
            System.out.print(s + " ");
        }
    }
}

package firstPart;

import java.util.Locale;

//1.4 подсчитать сколько раз символ встречается в строке, учитывая различные раскладки
public class CharacterCount {
    public static void main(String[] args) {
        char[] strings = "aRdersRn".toCharArray();
        char symbolToCount = Character.toUpperCase('R'); // символ, который хотим подсчитать (переводим в верхний регистр)
        int count = 0;
        System.out.print("String: ");
        for (char s : strings) {
            System.out.print(s + " ");
        }
        for (char string : strings) {
            if (string == symbolToCount || string == symbolToCount + 32) {
                count++;
            }
        }
        System.out.println("\nCount of characters: " + count);
    }
}
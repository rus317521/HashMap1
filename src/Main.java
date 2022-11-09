import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        int maxCount = -1;
        int minCount = Integer.MAX_VALUE;
        char maxChar = ' ';
        char minChar = ' ';
        
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isLetter(symbol)) {
                if (map.containsKey(symbol)) {
                    int value = map.get(symbol);
                    value++;
                    map.put(symbol, value);
                } else {
                    map.put(symbol, 1);
                }
            }
            continue;
        }
        for (char MyChar : map.keySet()
        ) {
            if (map.get(MyChar) > maxCount) {
                maxCount = map.get(MyChar);
                maxChar = MyChar;
            }
            if (map.get(MyChar) < minCount) {
                minCount = map.get(MyChar);
                minChar = MyChar;
            }

        }
        System.out.println("Самый часто встречающийся символ: " + maxChar);
        System.out.println("Самый редко встречающийся символ: " + minChar);

    }
}


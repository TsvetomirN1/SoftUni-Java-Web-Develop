package MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Character, Integer> Count = new LinkedHashMap<>();

        String input = scanner.nextLine();

        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!Count.containsKey(symbol)) {
                Count.put(symbol, 1);
            } else {
                int oldValue = Count.get(symbol) + 1;
                Count.put(symbol, oldValue);
            }
        }
        for (Map.Entry<Character, Integer> entry : Count.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}

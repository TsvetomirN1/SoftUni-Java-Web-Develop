package Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);

        System.out.println(charactersInRange(one, two));

    }

    static String charactersInRange(char one, char two) {
        String range = "";
        if ((int) one < (int) two) {
            for (int i = one + 1; i < two; i++) {
                char r = (char) i;

                range += (r + " ");
            }
        } else {
            for (int i = two + 1; i < one; i++) {
                char r = (char) i;

                range += (r + " ");
            }
        }
        return range;

    }
}


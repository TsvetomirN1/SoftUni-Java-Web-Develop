package BasicsSyntax;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String reversed = "";

        for (int index = input.length()-1; index >=0 ; index--) {

            reversed = ""+ input.charAt(index);

            System.out.print(reversed);

        }
    }
}



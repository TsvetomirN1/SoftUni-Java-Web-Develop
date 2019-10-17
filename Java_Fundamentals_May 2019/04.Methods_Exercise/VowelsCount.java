package Methods_Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.toLowerCase();

        System.out.println(countVowels(text));
    }

   static int countVowels(String text){
        int counter = 0;
       for (int i = 0; i <text.length() ; i++) {
           char letter = text.charAt(i);
           if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
               counter++;
           }

       }

        return counter;
   }
}

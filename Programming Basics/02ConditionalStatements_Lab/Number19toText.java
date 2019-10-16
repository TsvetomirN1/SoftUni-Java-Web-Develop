package ConditionalStatements;

import java.util.Scanner;

public class Number19toText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        if (numbers== 1) {
            System.out.println("one");

        }else if (numbers==2){
            System.out.println("two");
        }else if (numbers==3){
            System.out.println("three");
        }else if (numbers==4){
            System.out.println("four");
        }else if (numbers==5){
            System.out.println("five");
        }else if (numbers==6){
            System.out.println("six");
        }else if (numbers==7){
            System.out.println("seven");
        }else if (numbers==8){
            System.out.println("eight");
        }else if (numbers==9){
            System.out.println("nine");

        }else {
            System.out.println("number too big");
        }
    }
}

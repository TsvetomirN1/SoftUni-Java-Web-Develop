package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        if(operator.equals("-") || operator.equals("+") || operator.equals("*")){
            String type = "";
            switch (operator){
                case "-": {
                    result = n1-n2;
                    type = result % 2 == 0 ? "even":"odd";
                    break;
                }
                case "+": {
                    result = n1+n2;
                    type = result % 2 == 0 ? "even":"odd";
                    break;
                }
                case "*": {
                    result = n1*n2;
                    type = result % 2 == 0 ? "even":"odd";
                    break;
                }
            }
            System.out.printf("%.0f %s %.0f = %.0f - %s", n1, operator, n2, result, type);
        }
        else if(operator.equals("/") || operator.equals("%")){
            if(n2 == 0){
                System.out.printf("Cannot divide %.0f by zero", n1);
            }
            else {
                switch (operator){
                    case "/": {
                        result = n1/n2;
                        System.out.printf("%.0f %s %.0f = %.2f", n1, operator, n2, result);
                        break;
                    }
                    case "%": {
                        result = n1%n2;
                        System.out.printf("%.0f %s %.0f = %.0f", n1, operator, n2, result);
                        break;
                    }
                }
            }
        }
    }
}



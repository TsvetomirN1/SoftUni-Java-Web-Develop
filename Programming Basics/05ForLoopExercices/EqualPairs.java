package ForLoopExercices;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int globalSum = 0;
        int previousSum = -1;
        int largeDifference = 0;
        boolean areAllEqual = true;

        for (int i = 0; i < n; i++){
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());

            int sum = number1+number2;

            if (i ==0){
               previousSum=sum;

            }else{
                String deb = "";
                if (previousSum!=sum){
                    areAllEqual=false;
                    int diff = Math.abs(previousSum-sum);
                    if (diff>largeDifference){
                        largeDifference=diff;

                    }
                }
                previousSum=sum;
            }
        }
        if (areAllEqual){
            System.out.printf("Yes, value=%d", previousSum);
        }else {
            System.out.printf("No, maxdiff=%d", largeDifference);
        }


    }
}

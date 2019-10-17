package ExamsPractice6;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desireHigh = Integer.parseInt(scanner.nextLine());

        int startingHigh = desireHigh-30;
        int jumpCounter = 0;
        int unsuccessful = 0;
        boolean isFailed = false;

        for (int i = 0; i <=3; i++) {
            jumpCounter+=1;
            int jump = Integer.parseInt(scanner.nextLine());

            if (startingHigh<jump){
                if (startingHigh>=desireHigh){
                    break;
                }
                startingHigh+=5;
                if (i>0){
                    unsuccessful=0;
                }
                i=0;
            }else {
                unsuccessful+=1;
                if (unsuccessful==3){
                    isFailed = true;
                    break;
                }
            }

        }
        if (isFailed){
            System.out.printf("Tihomir failed at %dcm after %d jumps.",startingHigh,jumpCounter);
        }else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",startingHigh,jumpCounter);
        }
    }
}

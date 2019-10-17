package List_Arrays.ListExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> train = new ArrayList<>();

        String[] inputData = scanner.nextLine().split(" ");

        for (int i = 0; i < inputData.length; i++) {
            train.add(Integer.parseInt((inputData)[i]));

        }

        int wagonCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] tokens = command.split(" ");
            if (command.contains("Add")) {
                int passengers = Integer.parseInt(tokens[1]);
                train.add(passengers);
            } else {
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i <train.size() ; i++) {
                    int newPassengersCount = passengers+train.get(i);

                    if (newPassengersCount<=wagonCapacity){
                       train.set(i,newPassengersCount);
                       break;
                    }

                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < train.size(); i++) {

            System.out.print(train.get(i) + " ");

        }
    }
}

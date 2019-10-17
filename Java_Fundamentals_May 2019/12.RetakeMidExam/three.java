package RetakeMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warship = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Retire")) {

            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Fire":
                    int index = Integer.parseInt(tokens[1]);
                    int damage = Integer.parseInt(tokens[2]);
                    for (int i = 0; i <warship.size() ; i++) {

                            if (index>0 && index<=warship.size()){
                              if (index== warship.get(i)){

                              }

                            }
                    }


                    break;
                case "Defend":

                    break;
                case "Repair":

                    break;
                case "Status":

                    break;

            }


            command = scanner.nextLine();
        }
    }
}

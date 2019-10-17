package List_Arrays.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" +")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" +");
            String type = tokens[0];
            int element = Integer.parseInt(tokens[1]);
            if (type.equals("Delete")) {
                while (numbers.contains(element)) {
                    int index = numbers.indexOf(element);
                    if (index!=-1){
                        numbers.remove(index);
                    }
                }

            } else if (type.equals("Insert")){
                int index = Integer.parseInt(tokens[2]);
                if (index>=0 && index<numbers.size() )
                numbers.add(index, element);

            }

            command = scanner.nextLine();
        }


        for (int i = 0; i < numbers.size(); i++) {

            System.out.print(numbers.get(i) + " ");

        }
    }
}



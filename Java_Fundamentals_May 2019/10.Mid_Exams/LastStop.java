package MIDEXAMS.Exams_Practice;

import java.util.*;
import java.util.stream.Collectors;

public class LastStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        List<Integer> collectionOfPaintings = new ArrayList<>();
        collectionOfPaintings = Arrays.stream(inputLine.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("END")) {
            String[] tokens = commandLine.split("\\s+");
            switch (tokens[0]) {
                case "Change":
                    int paintingNumber = Integer.parseInt(tokens[1]);
                    if (collectionOfPaintings.contains(paintingNumber)){
                        int index = collectionOfPaintings.indexOf(paintingNumber);
                        collectionOfPaintings.set(index, Integer.parseInt(tokens[2]));
                    }
                    break;
                case "Hide":
                    paintingNumber = Integer.parseInt(tokens[1]);
                    if (collectionOfPaintings.contains(paintingNumber)) {
                        int index = collectionOfPaintings.indexOf(paintingNumber);
                        collectionOfPaintings.remove(index);
                    }
                    break;
                case "Switch":
                    paintingNumber = Integer.parseInt(tokens[1]);
                    int paintingNumber2 = Integer.parseInt(tokens[2]);
                    if (collectionOfPaintings.contains(paintingNumber)) {
                        if (collectionOfPaintings.contains(paintingNumber2)) {
                            int index1 = collectionOfPaintings.indexOf(paintingNumber);
                            int index2 = collectionOfPaintings.indexOf(paintingNumber2);
                            int temporary = collectionOfPaintings.get(index1);
                            collectionOfPaintings.set(index1, collectionOfPaintings.get(index2));
                            collectionOfPaintings.set(index2,temporary);
                        }
                    }
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(tokens[1]);
                    int paintingToInsert = Integer.parseInt(tokens[2]);
                    if (indexToInsert>=-1 && indexToInsert<=collectionOfPaintings.size()-1){
                        collectionOfPaintings.add(indexToInsert+1,paintingToInsert);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(collectionOfPaintings);
                    break;

            }

            commandLine = scanner.nextLine();
        }

        System.out.println(collectionOfPaintings.toString().replaceAll("[\\[\\],]", ""));
    }
}

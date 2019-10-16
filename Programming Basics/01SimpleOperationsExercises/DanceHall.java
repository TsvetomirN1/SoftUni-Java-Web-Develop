        package SimpleOperationsExercises;

        import java.util.Scanner;

        public class DanceHall {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double length = Double.parseDouble(scanner.nextLine())*100;
                double width = Double.parseDouble(scanner.nextLine())*100;
                double wardrobeSide = Double.parseDouble(scanner.nextLine())*100;
                double sizeOfHall = length * width;
                double sizeOfBench = sizeOfHall / 10;
                double sizeOfWardrobe = wardrobeSide * wardrobeSide;

                double sizeOfFreeHall = sizeOfHall - (sizeOfBench+sizeOfWardrobe);
                double SpaceperDancer = 7000+40;
                double totalDancers = Math.floor(sizeOfFreeHall / SpaceperDancer);
                System.out.printf("%.0f", Math.floor(totalDancers));


            }
        }

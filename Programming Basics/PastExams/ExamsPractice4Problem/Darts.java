package ExamsPractice4;

        import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int successfulShots = 0;
        int unsuccessfulShots = 0;
        int totalPoints = 301;

        while (totalPoints!=0) {
            String field = scanner.nextLine();

            if ("Retire".equals(field)){
                break;
            }
            int points = Integer.parseInt(scanner.nextLine());

            if (field.equals("Triple")) {
                totalPoints -= points * 3;
                successfulShots++;

            } else if (field.equals("Double")) {
                totalPoints -= points * 2;
                successfulShots++;

            }
            if (totalPoints-points>=0) {
                totalPoints-=points;
                successfulShots++;

            }else {
                unsuccessfulShots++;

            }

        }
        if (totalPoints == 0) {
            System.out.printf("%s won the leg with %d shots.", name, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, unsuccessfulShots);
        }
    }
}

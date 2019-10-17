package RegularExpressionsExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("@(?:[^@\\-!:]*?)(?<name>[A-Za-z]+)(?:[^@\\-!:]*):(?:[^@\\-!:]*?)" +
                "(?<population>[\\d]+)(?:[^@\\-!:]*?)!(?:[^@\\-!:]*?)" +
                "(?<attack>[A|D])!(?:[^@\\-!:]*?)->(?:[^@\\-!:]*?)(?<soldier>[\\d]+)(?:[^@\\-!:]*?)");

        Map<String,Integer> attackedPlanets = new TreeMap<>();
        Map<String,Integer> destroyedPlanets = new TreeMap<>();

        for (int i = 1; i <=n; i++) {
            String input = scanner.nextLine();

            int count = findCount(input);
            String message = decryptedMessage(count,input);

            Matcher matcher = pattern.matcher(message);

            if (matcher.find()){

                String name = matcher.group("name");

                if (matcher.group("attack").equalsIgnoreCase("a")){
                    attackedPlanets.putIfAbsent(name,0);
                    attackedPlanets.put(name,attackedPlanets.get(name)+1);
                }else {
                    destroyedPlanets.putIfAbsent(name,0);
                    destroyedPlanets.put(name,destroyedPlanets.get(name)+1);
                }
            }
        }

        System.out.println("Attacked planets: "+attackedPlanets.size());
        attackedPlanets.forEach((key,value)-> System.out.println("-> "+key));

        System.out.println("Destroyed planets: "+destroyedPlanets.size());
        destroyedPlanets.forEach((key,value)-> System.out.println("-> "+key));
    }

    private static int findCount(String input) {

        Pattern compile = Pattern.compile("[SsTtAaRr]");
        Matcher matcher = compile.matcher(input);

        int count = 0;

        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private static String decryptedMessage(int count , String data) {

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            int nowChar = data.charAt(i)-count;
            message.append((char)nowChar);
        }
        return message.toString();
    }
}

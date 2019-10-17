package DataTypesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());     //n
        int distance = Integer.parseInt(scanner.nextLine());      //m
        int exhaustFactor = Integer.parseInt(scanner.nextLine());  //y
        int initialPower = pokePower;
        int pokeTargets = 0;
        while (pokePower >= distance) {
            pokePower -= distance;
            pokeTargets++;

            if (pokePower == initialPower / 2.00 && exhaustFactor!=0) {
                pokePower /= exhaustFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokeTargets);
    }
}

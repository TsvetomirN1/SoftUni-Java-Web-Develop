package DefiningClasses.PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        Map<String, Trainer> trainerMap = new LinkedHashMap<>();

        while (!"Tournament".equals(command = scanner.nextLine())) {

            String[] data = command.split("\\s+");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainerMap.putIfAbsent(trainerName, trainer);
            trainerMap.get(trainerName).addPokemon(pokemon);
        }

        while (!"End".equals(command = scanner.nextLine())) {
            for (Trainer trainer : trainerMap.values()) {
                if (trainer.hasElement(command)) {
                    trainer.addBadges(1);
                } else {
                    for (List<Pokemon> pokemons : trainer.getPokemons().values()) {
                        for (Pokemon pokemon : pokemons) {
                            pokemon.damage(10);

                        }
                    }

                    trainer.getPokemons()
                            .values()
                            .forEach(e -> e.removeIf(w -> w.getHealth() <= 0));
                }
            }
        }

        trainerMap.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().getBadges(), a.getValue().getBadges()))
                .forEach(e -> System.out.println(e.getValue().toString()));
    }
}

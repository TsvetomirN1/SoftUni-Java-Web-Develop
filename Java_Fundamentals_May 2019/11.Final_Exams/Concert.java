package FinalExamTests;

import java.util.*;

public class Concert {

    static class Band {
        private String name;
        private int time;
        List<String> members = new ArrayList<>();

        public Band(String name) {
            this.name = name;
        }

        public int getTime() {
            return time;
        }

        public void play(int time) {
            this.time += time;
        }

        public void add(String member) {
            if (!this.members.contains(member))
                this.members.add(member);
        }

        public String getName() {
            return name;
        }

        public List<String> getMembers() {
            return members;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Band> bandsByName = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("start of concert")) {
            String[] commandBandParameters = input.split("; ");
            String bandName = commandBandParameters[1];
            Band band = bandsByName.get(commandBandParameters[1]);
            if (band == null) {
                band = new Band(bandName);
                bandsByName.put(commandBandParameters[1], band);
            }
            if (commandBandParameters[0].equals("Play")) {
                int playTime = Integer.parseInt(commandBandParameters[2]);
                band.play(playTime);

            } else if (commandBandParameters[0].equals("Add")) {
                String[] members = commandBandParameters[2].split(", ");
                for (String member : members) {
                    band.add(member);
                }

            } else {
                throw new IllegalStateException("unknown command");
            }


            input = scanner.nextLine();
        }
        int totalTime = 0;
        List<Band> bandSorted = new ArrayList<>(bandsByName.values());
        Collections.sort(bandSorted, (a, b) -> {
            int timeCompare = Integer.compare(b.getTime(), a.getTime());
            if (timeCompare == 0) {
                return a.getName().compareTo(b.getName());
            } else {
                return timeCompare;
            }
        });
        for (Band band : bandsByName.values()) {
            totalTime += band.getTime();
        }
        System.out.println("Total time: " + totalTime);


        for (Band band : bandSorted) {
            System.out.println(band.getName() + " -> " + band.getTime());
        }

        String bandToPrint = scanner.nextLine();
        System.out.println(bandToPrint);
        Band band = bandsByName.get(bandToPrint);
        for (String member : band.getMembers()) {
            System.out.println(" => " + member);
        }
    }
}

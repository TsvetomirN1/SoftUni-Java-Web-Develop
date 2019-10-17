package RetakeFinal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> followersLikes = new LinkedHashMap<>();
        Map<String, Integer> followersComments = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("Log out")) {
            String[] tokens = line.split(":\\s+");

            switch (tokens[0]) {
                case "New follower": {
                    String userName = tokens[1];

                    if (!followersLikes.containsKey(userName)) {
                        followersLikes.put(userName, 0);

                    }
                    if (!followersComments.containsKey(userName)){
                        followersComments.put(userName, 0);

                    }
                    break;
                }
                case "Like": {
                    String userName = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if (!followersLikes.containsKey(userName)) {
                        followersLikes.put(userName, count);

                    } else {
                        int oldLikes = followersLikes.get(userName);
                        followersLikes.put(userName, oldLikes + count);
                    }
                    break;
                }
                case "Comment": {
                    String userName = tokens[1];

                    if (!followersComments.containsKey(userName)) {
                        followersComments.put(userName,1);


                    } else {
                        int oldComments = followersComments.get(userName);
                        followersComments.put(userName, oldComments + 1);
                    }

                    break;
                }
                case "Blocked": {
                    String userName = tokens[1];
                    if (followersLikes.containsKey(userName) && followersComments.containsKey(userName)) {
                        followersLikes.remove(userName);
                        followersComments.remove(userName);

                    } else {
                        System.out.printf("%s doesn't exist.%n", userName);
                    }

                }
                    break;

            }
            line = scanner.nextLine();
        }
        System.out.println(followersComments.size() +" " + "followers");

        followersLikes.entrySet().
                stream().
                sorted((f, s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());

                    }
                    return result;
                }).forEach(entry -> {
            System.out.printf("%s: %d%n",
                    entry.getKey(), entry.getValue() + followersComments.get(entry.getKey()));

        });
    }
}

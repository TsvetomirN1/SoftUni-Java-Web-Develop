package MIDEXAMS.MidExam16April;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shops = Arrays.stream(scanner.nextLine().split(" +"))
                .collect(Collectors.toList());
        int commands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commands; i++) {
            String input = scanner.next();
            switch (input) {
                case "Include":
                    String shop = scanner.next();
                    shops.add(shop);
                    break;
                case "Visit":
                    String position = scanner.next();
                    if (position.equals("first")) {
                        int numberOfShops = scanner.nextInt();
                        if (numberOfShops > shops.size()) {
                            break;
                        } else {
                            int count = 0;
                            for (int j = 0; j < shops.size(); j++) {
                                shops.remove(j);
                                j = -1;
                                count++;
                                if (count == numberOfShops) {
                                    break;
                                }
                            }
                        }
                    } else if (position.equals("last")) {
                        int numberOfShops = scanner.nextInt();
                        if (numberOfShops > shops.size()) {
                            break;
                        } else {
                            int count = 0;
                            for (int j = shops.size() - 1; j >= 0; j--) {
                                shops.remove(j);
                                count++;
                                if (count == numberOfShops) {
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case "Prefer":
                    int firstShopIndex = scanner.nextInt();
                    int secondShopIndex = scanner.nextInt();
                    if (firstShopIndex >= 0 && firstShopIndex < shops.size() && secondShopIndex >= 0 && secondShopIndex < shops.size()) {
                        String temp = shops.get(secondShopIndex);
                        shops.set(secondShopIndex, shops.get(firstShopIndex));
                        shops.set(firstShopIndex, temp);
                    }
                    break;
                case "Place":
                    String extraShop = scanner.next();
                    int newIndex = scanner.nextInt() + 1;
                    if (newIndex >= 0 && newIndex < shops.size()) {
                        shops.add(newIndex, extraShop);
                    }
                    break;
            }
        }
        System.out.println("Shops left:");

        for (String shop : shops
        ) {
            System.out.print(shop + " ");

        }
    }
}





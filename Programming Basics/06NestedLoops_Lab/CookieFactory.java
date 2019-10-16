package NestedLoops;

import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberBatch = Integer.parseInt(scanner.nextLine());
        for (int i =1; i<=numberBatch; i++){
            boolean isFlower = false;
            boolean isEggs = false;
            boolean isSugar = false;
            boolean isBake = false;
                    while(!isFlower || !isEggs || !isSugar|| !isBake){
                        String ingredient = scanner.nextLine();
                        if (ingredient.equals("flour")){
                            isFlower=true;
                        }else if (ingredient.equals("eggs")){
                            isEggs = true;
                        }else if (ingredient.equals("sugar")){
                            isSugar = true;
                        }else if (ingredient.equals("Bake!")){
                            if (isEggs && isEggs && isSugar){
                                isBake=true;
                                continue;
                            }else {
                                System.out.println("The batter should contain flour, eggs and sugar!");
                            }
                    }
                    }
            System.out.printf("Baking batch number %d...%n", i);
        }
    }
}

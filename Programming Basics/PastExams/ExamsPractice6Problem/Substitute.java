package ExamsPractice6;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < k; i++) {
            for (int i1 = 0; i1 < l; i1++) {
                for (int i2 = 0; i2 < m; i2++) {
                    for (int i3 = 0; i3 < n; i3++) {
                        if (k % 2 == 0 && m % 2 == 0) {
                            if (l % 2 == 1 && n % 2 ==1) {
                                System.out.printf("%d%d - %d%d",k,l,m,n);
                            }else if (k==m && l==n){
                                System.out.println("Cannot change the same player.");
                            }
                        }
                    }
                }

            }
        }

    }
}

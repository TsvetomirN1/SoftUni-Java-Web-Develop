package DefiningClasses.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String CREATE = "Create";
        final String DEPOSIT = "Deposit";
        final String SET_INTEREST = "SetInterest";
        final String GET_INTEREST = "GetInterest";
        final String Account_MISSING = "Account does not exist";
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> allAccounts = new HashMap<>();

        String[] input = scanner.nextLine().split(" ");
        String command = input[0];

        while (!command.equals("End")) {
            String output = null;

            switch (command) {
                case CREATE:
                    BankAccount account = new BankAccount();
                    allAccounts.put(account.getID(), account);
                    output = String.format("Account ID%d created", account.getID());
                    break;
                case DEPOSIT: {
                    int accountID = Integer.parseInt(input[1]);
                    double amount = Double.parseDouble(input[2]);

                    BankAccount current = allAccounts.get(accountID);
                    if (current == null) {
                        output = Account_MISSING;
                    } else {
                        current.deposit(amount);
                        allAccounts.put(accountID, current);
                        output = String.format("Deposited %.0f to ID%d", amount, accountID);
                    }
                    break;
                }
                case SET_INTEREST:
                    double interest = Double.parseDouble(input[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case GET_INTEREST:
                    int accountID = Integer.parseInt(input[1]);
                    int numberOfYears = Integer.parseInt(input[2]);
                    BankAccount current = allAccounts.get(accountID);
                    if (current == null) {
                        output = Account_MISSING;
                    } else {
                        output = String.format("%.2f", current.getProfitAfterYears(numberOfYears));
                        allAccounts.put(accountID, current);
                    }
                    break;
            }

            if (output != null) {
                System.out.println(output);
            }
            input = scanner.nextLine().split(" ");
            command = input[0];
        }
    }

}

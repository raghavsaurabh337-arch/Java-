
import java.util.*;

class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalbalance = 2343.9;
        int accountNumber = 987887;

        System.out.println("Enter the adharcardNumber of 12 digit : ");
        String adharcardNumber = sc.next();

        if (adharcardNumber.length() == 12 && adharcardNumber.matches("[0-9]+")) {

            System.out.println("number is valids ");

            System.out.println("Enter the age :");
            int age = sc.nextInt();

            if (18 < age && age < 100) {

                System.out.println("YOUR ARE ACCOUNT MAJOR 18+ ");

                System.out.println("Enter the accountNumber:");
                int accountNumberUser = sc.nextInt();

                if (accountNumber == accountNumberUser) {

                    if (totalbalance >= 1000) {
                        totalbalance -= 20;
                    }
                    else if (totalbalance == 0) {
                        totalbalance -= 200;
                    }

                    System.out.println("1.Chack balnace");
                    System.out.println("2.Withdrawal Balance");
                    System.out.println("3.Deposit Balance");
                    System.out.println("4.Exit");

                    int choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            System.out.println(totalbalance);
                            break;

                        case 2:
                            System.out.println("your account balnace :" + totalbalance);
                            System.out.println("Enter the Withdrawal balance ");

                            int Withdrawal = sc.nextInt();

                            if (totalbalance >= Withdrawal) {
                                totalbalance -= Withdrawal;
                                System.out.println("your account save in balance" + totalbalance);
                            }
                            else {
                                System.out.println("plz Withdrawal account is not totalbalance " + totalbalance);
                            }
                            break;

                        case 3:
                            System.out.println("your account balnace :" + totalbalance);
                            System.out.println("Enter the Deposit amount:");

                            int deposit = sc.nextInt();
                            totalbalance += deposit;

                            System.out.println("your account save in balance" + totalbalance);
                            break;

                        case 4:
                            System.out.println("Thank your...");
                            break;

                        default:
                            System.out.println("Invalid choice");
                    }
                }
                else {
                    System.out.println("do not match accountNumber");
                }

            }
            else {

                System.out.println("YOUR ARE ACCOUNT MINNER 18- ");

                System.out.println("Enter the accountNumber:");
                int accountNumberUser = sc.nextInt();

                if (accountNumber == accountNumberUser) {

                    if (totalbalance >= 1000) {
                        totalbalance -= 20;
                    }
                    else if (totalbalance == 0) {
                        totalbalance -= 200;
                    }

                    System.out.println("1.Chack balnace");
                    System.out.println("2.Withdrawal Balance");
                    System.out.println("3.Deposit Balance");
                    System.out.println("4.Exit");

                    int choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            System.out.println(totalbalance);
                            break;

                        case 2:
                            System.out.println("your account balnace :" + totalbalance);
                            System.out.println("Enter the Withdrawal balance ");

                            int Withdrawal = sc.nextInt();

                            if (totalbalance >= Withdrawal) {
                                totalbalance -= Withdrawal;
                                System.out.println("your account save in balance" + totalbalance);
                            }
                            else {
                                System.out.println("plz Withdrawal account is not totalbalance " + totalbalance);
                            }
                            break;

                        case 3:
                            System.out.println("your account balnace :" + totalbalance);
                            System.out.println("Enter the Deposit amount:");

                            int deposit = sc.nextInt();
                            totalbalance += deposit;

                            System.out.println("your account save in balance : Rs->" + totalbalance);
                            break;

                        case 4:
                            System.out.println("Thank your...");
                            break;

                        default:
                            System.out.println("Invalid choice");
                    }
                }
                else {
                    System.out.println("do not match accountNumber");
                }
            }

        }
        else {
            System.out.println("plz check tha adharcardNumber aur enter the adhar digit of 12 ");
        }
    }
}

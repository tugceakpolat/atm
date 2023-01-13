import java.util.Scanner;
public class atm {
    public static void main(String[] args) {

        String password;
        String userName;
        int due = 3;
        int select;
        int balance = 2000;
        int price;

        Scanner input = new Scanner(System.in);

        while (due > 0) {
            System.out.print("Enter a user name : ");
            userName = input.nextLine();

            System.out.print("Enter a password : ");
            password = input.nextLine();

            if (userName.equals("tugce") && password.equals("84212421")) {
                System.out.println("Welcome to X Bank!");
                do {
                    System.out.println(
                            "1-Withdraw money\n" +
                                    "2-Deposit money\n" +
                                    "3-Balance inquiry\n" +
                                    "4-Card return");
                    System.out.print("Select the action you want to do : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Enter the amount of money to deposit : ");
                        price = input.nextInt();
                        balance += price;
                        System.out.println("Your current balance : " + balance + "tl");
                    } else if (select == 2) {
                        System.out.print("Enter the amount of money to deposit : ");
                        price = input.nextInt();
                        if (balance < price) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= price;
                            System.out.println("Your current balance : " + balance + "tl");
                        }
                    } else if (select == 3) {
                        System.out.println("Your Balance : " + balance + "tl");
                    }
                } while (select != 4);
                System.out.println("Goodbye, see you again.");
                break;

            }else {
                System.out.println("You entered incorrectly. Please try again.\n"
                        + "Your remaining right : " + --due);
                if(due == 0){
                    System.out.println("Your card is blocked it happened. Please contact your bank.");
                }


            }

        }

    }

}


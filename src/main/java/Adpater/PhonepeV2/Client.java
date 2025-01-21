package Adpater.PhonepeV2;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Bank you want to use!");
        String BankName =  scanner.nextLine();

//        decision on which object to be created is being taken
        BankAPI bankAPI = BankAPIFactory
                .getBankAPIByBankName(BankName);

        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.fastTagRecharge(20);
    }

}

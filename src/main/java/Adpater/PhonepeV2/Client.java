package Adpater.PhonepeV2;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Bank you want to use!");
        String BankName =  scanner.nextLine();

        BankAPI bankAPI = null;
        if(BankName.equals("Yes Bank")){
            bankAPI = new YesBankAPIAdapter();
        } else if(BankName.equals("ICICI Bank")){
            bankAPI = new ICICIBankAPIAdapter();
        }

        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.fastTagRecharge(20);
    }

}

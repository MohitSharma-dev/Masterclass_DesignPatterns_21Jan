package Adpater.PhonepeV2;

public class PhonePeLoan {
    public boolean checkEligibility(int amount , BankAPI bankAPI){
//        10 % of loan amount in your account
        if(bankAPI.checkBalance() >= .1 * amount){
            System.out.println("Loan can be provided");
            return true;
        }
        return false;
    }
}

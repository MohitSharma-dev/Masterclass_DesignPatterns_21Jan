package Adpater.PhonepeV1;

public class PhonePeLoan {
    public boolean checkEligibility(int amount , YesBankAPI yesBankAPI){
//        10 % of loan amount in your account
        if(yesBankAPI.balanceCheck() >= .1 * amount){
            System.out.println("Loan can be provided");
            return true;
        }
        return false;
    }
}

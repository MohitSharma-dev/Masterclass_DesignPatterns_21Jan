package Adpater.PhonepeV2;

public class FastTag {
    public boolean recharge(int amount, BankAPI bankAPI){
        if(bankAPI.checkBalance() >= amount){
            System.out.println("Recharge is successfull");
            return true;
        }
        return false;
    }
}

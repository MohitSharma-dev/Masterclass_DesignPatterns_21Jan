package Adpater.PhonepeV1;

public class FastTag {
    public boolean recharge(int amount, YesBankAPI yesBankAPI){
        if(yesBankAPI.balanceCheck() >= amount){
            System.out.println("Recharge is successfull");
            return true;
        }
        return false;
    }
}

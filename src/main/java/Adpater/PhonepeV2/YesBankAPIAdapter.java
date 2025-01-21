package Adpater.PhonepeV2;

public class YesBankAPIAdapter implements BankAPI{
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int checkBalance() {
        return yesBankAPI.balanceCheck();
    }

    @Override
    public void transferMoney() {
        yesBankAPI.moneyTransfer();
    }
}

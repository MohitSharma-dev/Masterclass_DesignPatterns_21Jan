package Adpater.PhonepeV2;

public class ICICIBankAPIAdapter implements BankAPI{
    private ICICIBankAPI icicibankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return icicibankAPI.getBalance();
    }

    @Override
    public void transferMoney() {
        icicibankAPI.transfer();
    }
}

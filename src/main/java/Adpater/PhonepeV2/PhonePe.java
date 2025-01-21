package Adpater.PhonepeV2;

public class PhonePe {
    private FastTag fastTag;
    private PhonePeLoan phonePeLoan;
    private BankAPI bankAPI;

    PhonePe(BankAPI bankAPI){
        this.fastTag = new FastTag();
        this.phonePeLoan = new PhonePeLoan();
        this.bankAPI = bankAPI;
    }

    void fastTagRecharge(int amount){
        fastTag.recharge(amount , bankAPI);
    }

    void availLoan(int amount){
        phonePeLoan.checkEligibility(amount ,bankAPI);
    }
}

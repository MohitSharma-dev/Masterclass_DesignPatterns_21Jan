package Adpater.PhonepeV1;

public class PhonePe {
    private FastTag fastTag;
    private PhonePeLoan phonePeLoan;
    private YesBankAPI yesBankAPI;

    PhonePe(){
        this.fastTag = new FastTag();
        this.phonePeLoan = new PhonePeLoan();
        this.yesBankAPI = new YesBankAPI();
    }

    void fastTagRecharge(int amount){
        fastTag.recharge(amount , yesBankAPI);
    }

    void availLoan(int amount){
        phonePeLoan.checkEligibility(amount ,yesBankAPI);
    }
}

package OopPractice1;

public class CreditCard {
    private long cardNumber;
    private String cardOwner;
    //getter sertter 사용
    public CreditCard(long cardNumber, String cardOwner) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public long MoneyStack;
    public long pointStack;

    public void useCard(long amount){
        MoneyStack += amount;
    }

    public void cardMoney(long amount){
        MoneyStack -= amount;;
        pointGive(amount/1000);
    }

    private void pointGive(long point){
        pointStack += point;
    }

    //카드사용
    //카드비용지급
    //포인트적립

}


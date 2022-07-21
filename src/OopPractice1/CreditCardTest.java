package OopPractice1;

import java.util.ArrayList;

public class CreditCardTest {
    public static void main(String[] args) {
        //참조형                   변수형
        CreditCard myCard = new CreditCard(123_123_123_123L,"hi");
        //underbar 는 자리수 구분을 위한 것 시스템은 이해하지 못한다.
//        myCard.cardOwner = "Jae";
        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.getCardOwner());
        System.out.println("------------------------");
        myCard.setCardNumber(123_123_122_1234L);
        myCard.setCardOwner("jae");
        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.getCardOwner());
        myCard.useCard(10000);
        myCard.cardMoney(1000);
        System.out.println(myCard.MoneyStack);
        System.out.println(myCard.pointStack);

    }
}

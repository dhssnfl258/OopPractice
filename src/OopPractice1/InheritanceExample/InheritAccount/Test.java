package OopPractice1.InheritanceExample.InheritAccount;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        account account1 = new account();
        account1.accountNum = 100;
        account1.accountName = "mymy";
        account1.date = Calendar.getInstance().getTime();
//        account.money = 1;
        System.out.println("date:::" + account1.date);
    }
}

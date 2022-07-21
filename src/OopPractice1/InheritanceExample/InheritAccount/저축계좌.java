package OopPractice1.InheritanceExample.InheritAccount;

import java.util.Calendar;

public class 저축계좌 extends account{

    public void 값설정(){

        accountName = "은행계좌";
        date = Calendar.getInstance().getTime();
        accountNum = 12345;
//        super.money =1200;

    }
}

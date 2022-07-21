package OopPractice1.InheritanceExample.InheritAccount2;

import OopPractice1.InheritanceExample.InheritAccount.account;

import java.util.Calendar;

public class 저축계좌체크 extends account {

    public void check(){

        accountName = "계좌";
        date = Calendar.getInstance().getTime();
    }
}

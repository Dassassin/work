package day09.problem04;

import day09.problem04.bean.NewPhone;
import day09.problem04.bean.OldPhone;

public class Test4 {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.sendMessage();
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();
    }
}

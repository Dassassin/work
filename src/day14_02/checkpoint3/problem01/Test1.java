package day14_02.checkpoint3.problem01;

public class Test1 {
    public static void main(String[] args) {
        try {
            //login("b","123");
            //login("a","1234");
            DebitCard debitCard = new DebitCard("1111111111111111",-1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

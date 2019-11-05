package day08.problem04;

public class C extends B{
    private int numc = 30;

    @Override
    public void showA(){
        System.out.println("A类中numa:" +getNuma());
    }

    @Override
    public void showB() {
        System.out.println("B类中numb:" +getNumb());
    }

    public void showC() {
        System.out.println("C类中numc:" +numc);
    }
}

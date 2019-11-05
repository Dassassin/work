package day14_02.checkpoint2.problem01.com.xiaomi.level2_01;

public class Son extends Father{
    @Override
    public void eat() throws ToothPainException {
        try {
            super.eat();
        }catch (BigToothPainException e1){
            throw new BigToothPainException();
        }catch (FrontToothPainExcption e2){
            throw new FrontToothPainExcption();
        }
        //throw new TonguePainException();
        //throw new PainExecption();
        //throw new ToothPainException();
    }

    @Override
    public void drink() {
        super.drink();
        //throw new ToothPainException();
        //throw new TonguePainException();
        //throw new FrontToothPainExcption();
        try {
            System.out.println("喝到了100度的水");
            throw new TonguePainException();
        }catch (TonguePainException e){
            e.printStackTrace();
        }
    }
}

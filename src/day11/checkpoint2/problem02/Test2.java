package day11.checkpoint2.problem02;

public class Test2 {
    public static void main(String[] args) {
        String str = "a";
        long start1 = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            str += "a";
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String对象拼接字符串10000次共耗时毫秒：" + (end1 - start1));
        StringBuilder sb = new StringBuilder();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            sb.append("a");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder对象拼接字符串10000次共耗时毫秒：" + (end2 - start2));

    }
}

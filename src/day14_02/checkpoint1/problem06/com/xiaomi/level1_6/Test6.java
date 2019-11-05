package day14_02.checkpoint1.problem06.com.xiaomi.level1_6;

public class Test6 {
    public static void main(String[] args) throws Exception {
        testTryCatch();
        testThrows();
    }

    public static char charAt(String str, int index) throws Exception {
        if (str == null){
            throw new Exception("字符串不能为null");
        }
        if (str == ""){
            throw new Exception("字符串不能为空");
        }
        if (index < 0 || index > str.length()-1){
            throw new Exception("索引越界");
        }
        return str.charAt(index);
    }

    public static void testThrows() throws Exception {
        charAt("str",4);
    }

    public static void testTryCatch(){
        try {
            charAt(null,2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

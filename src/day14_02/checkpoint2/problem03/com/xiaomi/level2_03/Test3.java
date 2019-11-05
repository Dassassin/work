package day14_02.checkpoint2.problem03.com.xiaomi.level2_03;

public class Test3 {
    private static void login(String name,String pwd) throws LoginException {
        if (name != "a"){
            throw new LoginException("用户名不存在");
        }else if (pwd != "123"){
            throw new LoginException("密码错误");
        }else {
            System.out.println("欢迎"+name);
        }
    }

    public static void main(String[] args) {
        try {
            //login("b","123");
            //login("a","1234");
            login("a","123");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

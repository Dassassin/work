package day10.problem03.bean;

public class User {
    private String userType;
    private int userId;

    public User() {

    }

    public User(String userType, int userId) {
        this.userType = userType;
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

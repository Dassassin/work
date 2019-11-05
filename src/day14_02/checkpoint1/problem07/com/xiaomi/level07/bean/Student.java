package day14_02.checkpoint1.problem07.com.xiaomi.level07.bean;

import day14_02.checkpoint1.problem07.com.xiaomi.level07.NoScoreException;

public class Student {
    private String name;
    private int score;

    public Student() {

    }

    public Student(String name, int score) {
        this.setName(name);
        this.setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0){
            throw new NoScoreException("分数不能为负数:"+score);
        }
        this.score = score;
    }
}

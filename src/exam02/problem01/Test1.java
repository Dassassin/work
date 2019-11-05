package exam02.problem01;

public class Test1 {
    public static void main(String[] args) {
        int[] score = {99,100,98,97,96};
        int sum = 0,max = 0,min = 0,avg;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
            if (max == 0 || max < score[i]){
                max = score[i];
            }
            if (min == 0 || min > score[i]){
                min = score[i];
            }
        }
        avg = (sum - max - min) / (score.length - 2);
        System.out.println("该选手的最后得分为"+ avg);
    }
}

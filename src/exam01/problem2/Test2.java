package exam01.problem2;


import exam01.problem2.service.Ipml.FindTopValuesIpml;

public class Test2{
    public static void main(String[] args) {
        int[] ints = {1,2,5,9,4,6,8,15,32,41,26,27,51};
        FindTopValuesIpml ftvi = new FindTopValuesIpml();
        int max = ftvi.findMaxValue(ints);
        System.out.println("最大值为"+ max);
        int[] maxs = ftvi.findTopNValues(ints,3);
        System.out.println("前n个最大值为");
        //输出
    }
}

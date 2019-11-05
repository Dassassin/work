package exam01.problem2.service.Ipml;

import exam01.problem2.service.FindTopValues;

public class FindTopValuesIpml implements FindTopValues{
    @Override
    public int findMaxValue(int[] anyOldOrderValues) {
        int max = 0;
        for (int i = 0; i < anyOldOrderValues.length; i++){
            if (max == 0){
                max = anyOldOrderValues[i];
            }
            if (max < anyOldOrderValues[i]){
                max = anyOldOrderValues[i];
            }
        }
        return max;
    }

    @Override
    public int[] findTopNValues(int[] anyOldOrderValues, int n) {
        int[] maxs = {};
        for (int i = 0; i < n; i++){
            int max = findMaxValue(anyOldOrderValues);
            //maxs.push(maxs);//加入数组
            //anyOldOrderValues.//从数组中删掉
        }
        return maxs;
    }
}

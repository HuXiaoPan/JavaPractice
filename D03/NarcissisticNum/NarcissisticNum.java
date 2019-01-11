import java.util.ArrayList;

/**
 * NarcissisticNum
 */
public class NarcissisticNum {

    public static void main(String[] args) {
        for (int var : searchNarcissisticNum(100, 999)) {
            System.out.println(var);
        }
    }
    //得到自恋数
    private static Integer[] searchNarcissisticNum(int beginNum ,int endNum){
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = beginNum; i <= endNum; i++) {
            if (i==numSum(breakNum(i))) {
                numList.add(i);
            }
        }

        Integer[] narcissisticNums = new Integer[numList.size()];
        numList.toArray(narcissisticNums);
        return narcissisticNums;
    }
    //数字数组各项求数组长度幂再求和
    private static int numSum(int[] numArray) {
        int sum = 0;
        for (int var : numArray) {
            sum += (int) Math.pow(var, numArray.length);
        }
        return sum;
    }
    //打碎数字成为个位数
    private static int[] breakNum(int num) {
        int temp = 0;
        int numLength = numLength(num);
        int[] numChildren = new int[numLength];
        for (int i = 1; i <= numLength; i++) {
            int divident = (int) Math.pow(10, i);
            numChildren[i - 1] = ((num - temp) % divident) / ((int) Math.pow(10, i - 1));
        }
        return numChildren;
    }
    //获取数字位数
    private static int numLength(int num) {
        String numToString = "" + num;
        return numToString.length();
    }
}
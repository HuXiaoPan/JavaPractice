/**
 * OddNumSum
 */
public class OddNumSum {

    public static void main(String[] args) {
        int beginNum = 1;
        int endNum = 99;
        System.out.println(beginNum + "到" +  endNum + "之间的奇数和为：" + getSum(beginNum,endNum));
    }

    private static int getSum(int beginNum, int endNum) {
        int firstItem, lastItem, itemCount;
        firstItem = beginNum % 2 == 0 ? beginNum + 1 : beginNum;
        lastItem = endNum % 2 == 0 ? endNum - 1 : endNum;
        itemCount = (lastItem - firstItem) / 2;
        return (firstItem + lastItem) * itemCount / 2;
    }
}
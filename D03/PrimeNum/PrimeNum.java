import java.util.ArrayList;
import java.util.List;

/**
 * PrimeNum
 */
public class PrimeNum {

    public static void main(String[] args) {
        for (Integer var : searchPrimeNum(101, 200)) {
            System.out.println(var);
        }
    }

    private static Integer[] searchPrimeNum(int beginNum, int endNum) {
        ArrayList<Integer> primeNums = new ArrayList<Integer>();

        for (int i = beginNum; i <= endNum; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } 
                if (j >= Math.sqrt(i)) {
                    primeNums.add(i);
                    break;
                }
            }
        }

        Integer[] numList = new Integer[primeNums.size()];
        primeNums.toArray(numList);
        return numList;
    }
}
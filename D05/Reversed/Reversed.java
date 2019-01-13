/**
 * Reversed
 */
public class Reversed {

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5,6,7,8,9};
        printArrayItem(test);
        reversedArray(test);
        printArrayItem(test);
        
    }

    private static int[] reversedArray(int[] target){
        for (int i = 0; i < target.length/2; i++) {
            int temp;
            temp=target[i];
            target[i] = target[target.length-1-i];
            target[target.length-1-i] = temp;
        }
        return target;
    }

    private static void printArrayItem(int[] target){
        for (int var : target) {
            System.out.print(var + "\t");
        }
        System.out.println();
    }
}
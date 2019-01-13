/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] test = { 3, 4, 2, 8, 1, 9, 6, 0, 5, 7 };
        printArrayItem(test);
        sortTarget(test);
        printArrayItem(test);
    }

    private static void sortTarget(int[] target) {
        int temp;
        for (int i = 0; i < target.length - 1; i++) {
            for (int j = 0; j < target.length - 1 - i; j++) {
                if (target[j] > target[j + 1]) {
                    temp = target[j];
                    target[j] = target[j + 1];
                    target[j + 1] = temp;
                }
            }
        }
    }

    private static void printArrayItem(int[] target) {
        for (int var : target) {
            System.out.print(var + "\t");
        }
        System.out.println();
    }
}
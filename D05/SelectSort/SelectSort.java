/**
 * SelectSort
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] test = { 3, 4, 2, 8, 1, 9, 6, 0, 5, 7 };
        printArrayItem(test);
        sortTarget(test);
        printArrayItem(test);
    }

    private static void sortTarget(int[] target) {
        int temp;
        for (int i = 0; i < target.length; i++) {
            temp = target[i];
            for (int j = i + 1; j < target.length; j++) {
                if (temp > target[j]) {
                    target[i] = target[j];
                    target[j] = temp;
                    temp = target[i];
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
public class Rabbit {
    public static void main(String[] args) {
        for (int time = 1; time < 25; time++) {
            System.out.println("第"+time+"个月兔子的数量为"+sumRab(time));
        }

    }
    private static int sumRab(int time) {
        if (time == 1 || time == 2) {
            return 1;
        } else {
            return sumRab(time - 2) * 2 + sumRab(time - 1) -sumRab(time - 2);
        }
    }
}
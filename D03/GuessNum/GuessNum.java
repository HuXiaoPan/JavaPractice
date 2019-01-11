import java.util.Random;
import java.util.Scanner;

/**
 * GuessNum
 */
public class GuessNum {

    public static void main(String[] args) {
        gameBegin();
    }

    // 开始游戏画面
    private static void gameBegin() {
        System.out.println("--------------------猜字游戏--------------------");
        System.out.println("-------1.开始---------------------0.退出--------");
        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                int operation = 0;
                while(operation != 89757){
                System.out.println("请输入一个0-9的数字");
                int guessNum = scanner.nextInt();
                byte result = guessRandomNum(guessNum);
                operation = guessNum;
                switch (result) {
                case 0:
                    System.out.println("猜对了");
                    break;
                case 1:
                    System.out.println("猜大了");
                    break;
                case -1:
                    System.out.println("猜小了");
                    break;

                default:
                    break;
                }
            }
            } else if (choice == 0) {

            } else {
                System.out.println("输入错误，请重新输入！");
                gameBegin();
            }
        } catch (Exception e) {
            System.out.println("输入错误，请重新输入！");
            gameBegin();
        }

    }

    private static byte guessRandomNum(int num) {
        Random random = new Random();
        int randomNum = random.nextInt(10);
        if (randomNum == num) {
            return 0;
        } else if (randomNum >= num) {
            return -1;
        } else {
            return 1;
        }
    }

}
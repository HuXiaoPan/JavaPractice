import java.util.Random;
import java.util.Scanner;

/**
 * GuessNum
 */
public class GuessNum {

    public static void main(String[] args) {
        gameBegin();
    }

    // ��ʼ��Ϸ����
    private static void gameBegin() {
        System.out.println("--------------------������Ϸ--------------------");
        System.out.println("-------1.��ʼ---------------------0.�˳�--------");
        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                int operation = 0;
                while(operation != 89757){
                System.out.println("������һ��0-9������");
                int guessNum = scanner.nextInt();
                byte result = guessRandomNum(guessNum);
                operation = guessNum;
                switch (result) {
                case 0:
                    System.out.println("�¶���");
                    break;
                case 1:
                    System.out.println("�´���");
                    break;
                case -1:
                    System.out.println("��С��");
                    break;

                default:
                    break;
                }
            }
            } else if (choice == 0) {

            } else {
                System.out.println("����������������룡");
                gameBegin();
            }
        } catch (Exception e) {
            System.out.println("����������������룡");
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
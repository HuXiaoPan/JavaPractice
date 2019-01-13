/**
 * ASCIIDemo
 */
public class ASCIIDemo {

    public static void main(String[] args) {
        char symbol = 0;
        for(int i=0;i<=200; i++){
            symbol ++;
            System.out.print(symbol+"\t");
            if (i%10==0) {
                System.out.print("\n");
            }
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int N[] = new int[1000];
        int T;

        T = leia.nextInt();

        for (int i = 0; i < 1000; i++) {
            if (i > 0) {
                N[i] = N[i - 1] + 1;
            }
            if (N[i] == T) {
                N[i] = N[i] - T;
            }
            System.out.println("N[" + i + "] = " + N[i]);
        }

    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class SoNguyenTo {

    public static boolean Check(BigInteger n) {
        BigInteger x = new BigInteger("2");
        if (n.compareTo(x) == -1)
            return false;
        BigInteger div = n.divide(x);
        BigInteger i = new BigInteger("1");
        BigInteger y = div.multiply(x);
        int check = n.compareTo((x.multiply(x)));
        while (check >= 0) {
            div = n.divide(x);
            y = div.multiply(x);
            if (y.compareTo(n) == 0)
                return false;
            check = n.compareTo((x.multiply(x)));
            x = x.add(i);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger[] test = new BigInteger[n];

        for (int i = 0; i < n; i++) {
            test[i] = scanner.nextBigInteger();

        }

        for (BigInteger num : test) {
            if (Check(num) == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        scanner.close();

    }

}

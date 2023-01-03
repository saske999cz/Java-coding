import java.util.Scanner;
public class ChiaTien {
    public static void main(String[] args)
        {       Scanner scanner = new Scanner(System.in);
                long n;
                long a , b , c ;
                n = scanner.nextLong();
                if(n%8 != 0)
                System.out.println("NO");
                else{
                c = 3*n/4;
                b = 7*n/8;
                a = 11*n/8;
                System.out.println(a + " " + b + " "+ c);
                }
                scanner.close();





                
        }
    
}

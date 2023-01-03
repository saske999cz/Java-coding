import java.util.Scanner;
public class SoHoanHao {
   public static boolean  Check(int n){
        int sum = 0;
        int k = n;
        int count = 0;
        int[] a = new int[1000];
        while(k>0)
        {   a[count] = k%10;
            k/= 10;
            count++;
            
        }

        for(int i = 0; i < count; i++)
        {
            sum+= Math.pow(a[i],count);
        }
        if(sum==n) return true; 
        return false;
    }
    
    public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(Check(n) == true)
        System.out.println("YES");
        else 
        System.out.println("NO");;

        scanner.close();

    }

}

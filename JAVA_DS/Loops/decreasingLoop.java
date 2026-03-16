// GP

import java.util.Scanner;

public class decreasingLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scanner.nextInt();
        System.out.println("Enter the starting value (a) :");
        int a = scanner.nextInt(); 
        System.out.println("Enter the value of Difference (r) : "  );
        int r = scanner.nextInt();
        scanner.close();
        for(int i =1;i<=n;i++){
            System.out.println(a);
            a *=r;

        }

    }
    
}

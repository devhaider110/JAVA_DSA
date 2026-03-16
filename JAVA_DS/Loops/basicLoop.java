// public class basicLoop {
//     public static void main(String[] args) {
//         int i;
//         for (i = 1; i <=10 ; i++) {
//             System.out.println(i);
            
//         }
//         System.out.println();
//         System.out.println(i);
//     }
// }


// Enter your name and print no of times you want

// import java.util.Scanner;

// public class basicLoop {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

    
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine(); 

        
//         System.out.print("Enter the number of times to print: ");
//         int n = scanner.nextInt(); 

    
//         for (int i = 0; i < n; i++) {
//             System.out.println(name);
//         }

        
//         scanner.close();
//     }
// }

//print even no
// class basicLoop{
//     public static void main(String[] args) {
//         for (int i = 1; i <=100 ; i++) {
//             if(i%2==0){

//                 System.out.println(i);
//             }
//         }
//     }
// }

//print table of 17

// class basicLoop{
//     public static void main(String[] args) {
//         for (int i = 17; i <=170 ; i=i+17) {
//             // System.out.println("17 " + " * " + i + " = " + 17*i);
//             System.out.println(i);
//         }
//     }
// }

// print all odd number divisble by 3 from 1to 100

// public class basicLoop {

//     public static void main(String[] args) {
//         for (int i = 1; i <=100 ; i++) {
//             if(i % 2 != 0 & i % 3 ==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//AP -2,5,8,11,----n

// import java.util.Scanner;

// public class basicLoop {

//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Enter the limit (n):");

//         int n = scanner.nextInt();
        
//         int a= 4, d=6;
//         scanner.close();
//         for (int i = 1; i <=n; i++) {
//             System.out.println(a+ " ");
//             a +=d;
//         }                          
//     }
// }

// peint this series , 99,95,91... upto all terms which are postive
import java.util.Scanner;
public class basicLoop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
         System.out.println("Enter the limit (n):");

        int n = scanner.nextInt();
        int a=99,d=4;
        for (int i = 0; i <= n; i++) {
            if(a >0){
            System.out.print( a+ " ");
            a +=d;
            }
            
        }
        
    }
}
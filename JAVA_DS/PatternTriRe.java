// public class PatternTriRe {
//     public static void main(String[] args) {
//         int n=4;
//         int a=n;//no of star to be printed in each line
//         for (int i = 1; i <= n; i++) {
// //condition4
//             for (int j = 1; j <=a; j++) 
//             // for (int j = n; j >=i; j--)
//                 {
//                 System.out.print( (char)(j+96)+" ");
                
//             }
//             a--;
//             System.out.println();
            
//         }
//     }
// }

// a b c d 
// a b c
// a b
// a


// public class PatternTriRe {
//     public static void main(String[] args) {
//         int n=4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=n+1-i; j++) 
//             // for (int j = n; j >=i; j--)
//                 {
//                 System.out.print(j+ " ");
                
//             }
//             System.out.println();
            
//         }
//     }
// }

// 1 2 3 4
// 1 2 3
// 1 2
// 1

// public class PatternTriRe {
//     public static void main(String[] args) {
//         int n=4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=n+1-i; j++) 
//             // for (int j = n; j >=i; j--)
//                 {
//                 System.out.print("* ");
                
//             }
//             System.out.println();
            
//         }
//     }
// }

// * * * * 
// * * *
// * *
// *

// condition 1 = for (int j = 1; j <=n+1-i; j++)
// condition 2 = for (int j = i; j <=n; j++)
// condition 3 = for (int j = n; j >=i; j--)


//HW


public class PatternTriRe {
    public static void main(String[] args) {
        int n=4;
        int a=n;//no of star to be printed in each line
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=a; j++) {
                System.out.print( (char)(i+64)+" " ); 
            }
            a--;
            System.out.println();
            
        }
    }
}
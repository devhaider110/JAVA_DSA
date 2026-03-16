public class PatternTriVerFlipped {
    public static void main(String[] args) {
        int n=4;
        for (int i =1 ; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {//double space
                System.out.print("  ");
            }
            

            for (int j = 1; j <=i; j++) {//star
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
}

//       * 
//     * *
//   * * *
// * * * *



// method 1

// public class PatternTriVerFlipped {
//     public static void main(String[] args) {
//         int n=4;
//         for (int i =1 ; i <=n; i++) {
//             for (int j = 1; j <=n; j++) {
//                 if(i+j> n)
//                     System.out.print("*");
                
//                 else
//                     System.out.print(" ");
                
//             }
//             System.out.println();
            
//         }
//     }
// }

 
//    *
//   **
//  ***
// ****
public class PatternAlpaSqrHw {
    public static void main(String[] args) {
        int n =5;
        for(int i =0;i<=n;i++){
            for(int j =0; j<=n;j++){
                if(i%2==0){

                    System.out.print((char)('A' + i));
                }else{
                    System.out.print((char)('a'+ i));
                }

            }
            System.out.println();
        }
    }
}


// public class PatternAlphaSquare {
//     public static void main(String[] args) {
//         int n = 4;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print((char)('A' + i));
//             }
//             System.out.println();
//         }
//     }
// }


// AAAA
// BBBB
// CCCC
// DDDD

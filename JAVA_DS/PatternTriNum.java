public class PatternTriNum {
    public static void main(String[] args) {
        int n=4;
        for(int i =1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print((char) (64+j));
            }
            System.out.println();
        }
    }
}

// A
// AB
// ABC
// ABCD




// System.out.print((char) (64+i));
// A
// BB
// CCC
// DDDD
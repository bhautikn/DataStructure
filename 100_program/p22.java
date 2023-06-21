/**
    Print a following patterns

    patter 1         patter p2            pattern 3
 
        1        * * * * * * * * * *   * * * * * * * * *
       A B       * * * *     * * * *     * * * * * * *
      2 3 4      * * *         * * *       * * * * *
     C D E F     * *             * *         * * *
    5 6 7 8 9    *                 *           *
    
**/

public class p22 {
    public static void main(String[] args) {
        System.out.println();
        // block for pattern 1
        { 
            char ch = 'A';
            int n = 1;
            for (int i=1;i<=5;i++) {
                for (int j=5;j>i;j--)
                    System.out.print(" ");
                if(i%2==0)
                    for (int j=1;j<=i;j++)
                        System.out.print(ch+++" ");
                else
                    for (int j=1;j<=i;j++)
                        System.out.print(n+++" ");
                System.out.println();
            }
        }
        System.out.println();
        // block for pattern 2
        { 
            for (int i=1;i<=5;i++) {
                for (int j=1;j<i;j++)
                    System.out.print(" ");
                for (int j=(6-i)*2-1;j>0;j--)
                    System.out.print("*");
                System.out.println();
            }
        }
        System.out.println();
        // block for pattern 2
        { 
            for (int i=0;i<=5;i++) {
                for (int j=4-i;j>=0;j--)
                    System.out.print("*");
                for (int j=0;j<=(i*2)-1;j++)
                    System.out.print(" ");
                for (int j=4-i;j>=0;j--)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}